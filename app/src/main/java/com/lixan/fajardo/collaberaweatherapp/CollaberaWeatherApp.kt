package com.lixan.fajardo.collaberaweatherapp

import android.app.Application
import com.lixan.fajardo.collaberaweatherapp.di.modules.injector.ApplicationInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import timber.log.Timber
import javax.inject.Inject

class CollaberaWeatherApp : Application(), HasAndroidInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Any>


    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())

        ApplicationInjector.init(this)
    }

    override fun androidInjector(): AndroidInjector<Any> = activityInjector

}