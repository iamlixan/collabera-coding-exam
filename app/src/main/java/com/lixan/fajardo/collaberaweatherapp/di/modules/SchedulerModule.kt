package com.lixan.fajardo.collaberaweatherapp.di.modules

import com.lixan.fajardo.collaberaweatherapp.di.SchedulerProvider
import com.lixan.fajardo.collaberaweatherapp.di.base.BaseSchedulerProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SchedulerModule {

    @Provides
    @Singleton
    fun providesSchedulerProvider(): BaseSchedulerProvider = SchedulerProvider.getInstance()
}