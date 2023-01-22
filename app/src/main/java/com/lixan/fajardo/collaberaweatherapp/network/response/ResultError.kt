package com.lixan.fajardo.collaberaweatherapp.network.response

data class ResultError(
    val errorMessage: String,
    val cause: Throwable? = null,
    val errorCode: String? = ""
)