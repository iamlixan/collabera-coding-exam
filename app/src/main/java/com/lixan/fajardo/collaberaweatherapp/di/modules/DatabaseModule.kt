package com.lixan.fajardo.collaberaweatherapp.di.modules

import android.app.Application
import com.lixan.fajardo.collaberaweatherapp.local.database.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun providesAppDatabase(application: Application): AppDatabase =
        AppDatabase.getInstance(application.applicationContext)
}