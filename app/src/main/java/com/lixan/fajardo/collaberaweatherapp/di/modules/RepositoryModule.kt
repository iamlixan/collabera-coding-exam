package com.lixan.fajardo.collaberaweatherapp.di.modules

import com.lixan.fajardo.collaberaweatherapp.data.repository.implementation.GitUserRepositoryImpl
import com.lixan.fajardo.collaberaweatherapp.data.repository.source.GitUserRepository
import com.lixan.fajardo.collaberaweatherapp.local.source.GitUserLocalRepository
import com.lixan.fajardo.collaberaweatherapp.network.remoterepository.source.GitUserRemoteRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideGitUserRepository(
        remote: GitUserRemoteRepository,
        local: GitUserLocalRepository
    ): GitUserRepository = GitUserRepositoryImpl(remote, local)

}