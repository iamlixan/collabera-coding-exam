package com.lixan.fajardo.collaberaweatherapp.local

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.lixan.fajardo.collaberaweatherapp.data.models.GitUser

class GitUserDBTypeConverter {

    @TypeConverter
    fun saveFromList(gitUserList: List<GitUser>): String {
        return Gson().toJson(gitUserList)
    }


}