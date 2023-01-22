package com.lixan.fajardo.collaberaweatherapp.main

import android.os.Bundle
import com.lixan.fajardo.collaberaweatherapp.di.base.BaseViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(

): BaseViewModel() {
    override fun isFirstTimeUICreated(bundle: Bundle?) = Unit

}