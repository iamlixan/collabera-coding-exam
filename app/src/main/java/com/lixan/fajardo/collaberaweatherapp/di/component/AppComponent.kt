package com.lixan.fajardo.collaberaweatherapp.di.component

import android.app.Application
import com.lixan.fajardo.collaberaweatherapp.CollaberaWeatherApp
import com.lixan.fajardo.collaberaweatherapp.di.modules.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AppModule::class,
        AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class,
        NetworkModule::class,
        SchedulerModule::class,
        DatabaseModule::class,
        ApiServiceModule::class,
        RemoteRepositoryModule::class,
        LocalRepositoryModule::class,
        RepositoryModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): AppComponent
    }

    fun inject(app: CollaberaWeatherApp)
}