package com.lixan.fajardo.collaberaweatherapp.di.base

import android.os.Bundle
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.google.android.material.snackbar.Snackbar
import com.lixan.fajardo.collaberaweatherapp.R
import com.lixan.fajardo.collaberaweatherapp.utils.SNACKBAR_MAX_LINES
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

abstract class BaseActivity<BINDING: ViewDataBinding>: AppCompatActivity(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    lateinit var binding: BINDING

    protected val disposables: CompositeDisposable = CompositeDisposable()

    @Inject
    lateinit var schedulers: BaseSchedulerProvider

    @LayoutRes
    abstract fun getLayoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, getLayoutId())
        binding.lifecycleOwner = this
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchingAndroidInjector

    fun showErrorSnackbar(message: String) {
        val snackbar = Snackbar.make(binding.root, message, Snackbar.LENGTH_LONG)
        val snackBarView = snackbar.view
        val tvSnackbar: TextView = snackBarView.findViewById(com.google.android.material.R.id.snackbar_text)
        tvSnackbar.maxLines = SNACKBAR_MAX_LINES
        snackBarView.setBackgroundColor(ContextCompat.getColor(this, R.color.torch_red))
        snackbar.show()
    }

    fun showSuccessSnackbar(message: String) {
        val snackbar = Snackbar.make(binding.root, message, Snackbar.LENGTH_SHORT)
        val snackBarView = snackbar.view
        snackBarView.setBackgroundColor(ContextCompat.getColor(this, R.color.sushi))
        snackbar.show()
    }
}