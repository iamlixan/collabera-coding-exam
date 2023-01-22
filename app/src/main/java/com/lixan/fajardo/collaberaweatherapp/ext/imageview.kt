package com.lixan.fajardo.collaberaweatherapp.ext

import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.lixan.fajardo.collaberaweatherapp.GlideApp
import com.lixan.fajardo.collaberaweatherapp.R
import jp.wasabeef.glide.transformations.gpu.InvertFilterTransformation
import timber.log.Timber

fun ImageView.loadUserAvatar(url: String?) {
    GlideApp.with(this.context)
        .load(url)
//        .placeholder(R.drawable.ic_placeholder)
//        .error(R.drawable.ic_placeholder)
//        .fallback(R.drawable.ic_placeholder)
        .skipMemoryCache(false)
        .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
        .listener(object : RequestListener<Drawable> {
            override fun onLoadFailed(
                e: GlideException?,
                model: Any?,
                target: Target<Drawable>?,
                isFirstResource: Boolean
            ): Boolean {
                Timber.e("onLoadFailed Error $e")
                return false
            }

            override fun onResourceReady(
                resource: Drawable?,
                model: Any?,
                target: Target<Drawable>?,
                dataSource: DataSource?,
                isFirstResource: Boolean
            ): Boolean {
                return false
            }
        })
        .into(this)

}

fun ImageView.loadInvertedUserAvatar(url: String?) {
    GlideApp.with(this.context)
        .load(url)
//        .placeholder(R.drawable.ic_placeholder)
//        .error(R.drawable.ic_placeholder)
//        .fallback(R.drawable.ic_placeholder)
        .skipMemoryCache(false)
        .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
        .listener(object : RequestListener<Drawable> {
            override fun onLoadFailed(
                e: GlideException?,
                model: Any?,
                target: Target<Drawable>?,
                isFirstResource: Boolean
            ): Boolean {
                Timber.e("onLoadFailed Error $e")
                return false
            }

            override fun onResourceReady(
                resource: Drawable?,
                model: Any?,
                target: Target<Drawable>?,
                dataSource: DataSource?,
                isFirstResource: Boolean
            ): Boolean {
                return false
            }
        })
        .apply(RequestOptions.bitmapTransform(InvertFilterTransformation()))
        .into(this)
}