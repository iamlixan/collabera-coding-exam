package com.lixan.fajardo.collaberaweatherapp.main

import com.lixan.fajardo.collaberaweatherapp.R
import com.lixan.fajardo.collaberaweatherapp.databinding.ActivityMainBinding
import com.lixan.fajardo.collaberaweatherapp.di.base.BaseViewModelActivity

class MainActivity: BaseViewModelActivity<ActivityMainBinding, MainViewModel>() {

    override fun getLayoutId(): Int = R.layout.activity_main

}