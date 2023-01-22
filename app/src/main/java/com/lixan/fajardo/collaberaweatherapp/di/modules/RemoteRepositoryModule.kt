package com.lixan.fajardo.collaberaweatherapp.di.modules

import com.google.gson.Gson
import com.lixan.fajardo.collaberaweatherapp.network.ApiService
import com.lixan.fajardo.collaberaweatherapp.network.remoterepository.implementation.GitUserRemoteRepositoryImpl
import com.lixan.fajardo.collaberaweatherapp.network.remoterepository.source.GitUserRemoteRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteRepositoryModule {

    @Provides
    @Singleton
    fun provideGitUserRemoteRepository(
        apiService: ApiService,
        gson: Gson
    ): GitUserRemoteRepository = GitUserRemoteRepositoryImpl(apiService, gson)

}