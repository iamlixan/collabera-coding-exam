package com.lixan.fajardo.collaberaweatherapp.network.response

import com.lixan.fajardo.collaberaweatherapp.network.response.base.BaseResponse
import com.lixan.fajardo.collaberaweatherapp.network.response.dto.GitUserDTO

data class GitUsersResponseData(val gitUsersList: List<GitUserDTO>): BaseResponse()