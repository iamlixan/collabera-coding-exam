package com.lixan.fajardo.collaberaweatherapp.di.modules

import com.lixan.fajardo.collaberaweatherapp.local.database.AppDatabase
import com.lixan.fajardo.collaberaweatherapp.local.implementation.GitUserLocalRepositoryImpl
import com.lixan.fajardo.collaberaweatherapp.local.source.GitUserLocalRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class LocalRepositoryModule {

    @Provides
    @Singleton
    fun providesGitUserLocalRepository(database : AppDatabase): GitUserLocalRepository =
        GitUserLocalRepositoryImpl(database)
}