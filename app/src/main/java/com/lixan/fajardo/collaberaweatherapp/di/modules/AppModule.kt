package com.lixan.fajardo.collaberaweatherapp.di.modules

import android.app.Application
import android.content.Context
import com.lixan.fajardo.collaberaweatherapp.di.scope.ApplicationContext
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class AppModule {

    @ApplicationContext
    @Singleton
    @Binds
    abstract fun provideApplicationContext(application: Application): Context
}