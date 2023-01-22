package com.lixan.fajardo.collaberaweatherapp.di.modules

import com.lixan.fajardo.collaberaweatherapp.di.scope.ActivityScope
import com.lixan.fajardo.collaberaweatherapp.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

}