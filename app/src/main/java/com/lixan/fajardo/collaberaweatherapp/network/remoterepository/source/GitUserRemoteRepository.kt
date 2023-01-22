package com.lixan.fajardo.collaberaweatherapp.network.remoterepository.source

import com.lixan.fajardo.collaberaweatherapp.data.models.GitUser
import com.lixan.fajardo.collaberaweatherapp.network.response.RequestResult
import io.reactivex.Single

interface GitUserRemoteRepository {

    fun getUsers(page: Int = 0): Single<RequestResult<Map<String, Any>>>

    fun getUserProfile(userName: String): Single<RequestResult<GitUser>>
}