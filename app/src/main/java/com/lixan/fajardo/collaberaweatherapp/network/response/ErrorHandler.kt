package com.lixan.fajardo.collaberaweatherapp.network.response

import com.google.gson.Gson
import com.lixan.fajardo.collaberaweatherapp.network.response.base.BaseErrorResponse
import retrofit2.HttpException
import timber.log.Timber
import java.io.IOException
import java.net.UnknownHostException

class ErrorHandler {

    companion object {
        fun handleError(throwable: Throwable): ResultError {
            return when (throwable) {
                is HttpException -> {
                    val errorBody = throwable.response()!!.errorBody()
                    val errorResponse = Gson().fromJson(errorBody!!.string(), BaseErrorResponse::class.java)
                    val errorMessage = if (errorResponse.message.isNotEmpty()) {
                        errorResponse.message
                    } else {
                        "There has a problem with the network."
                    }

                    ResultError(errorMessage, throwable, errorResponse.errorCode)
                }
                is IOException,
                is UnknownHostException -> {
                    ResultError("Please check your network connection", throwable)
                }
                else -> {
                    Timber.e(throwable)
                    ResultError("Something went wrong.", throwable)
                }
            }
        }
    }
}