package com.jake.kotlinsample.view.custom

import android.content.Context
import android.support.annotation.DrawableRes
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.jake.kotlinsample.R
import java.util.jar.Attributes

/**
 * @author Jake
 * Created by Jake on 2018-05-18 018.
 */
class GlideImageView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
        AppCompatImageView(context, attrs, defStyleAttr) {

    fun loadImage(url: String?, @DrawableRes loadImageRes: Int = R.drawable.ic_bubble_chart_white_50dp) {
        Glide.with(this)
                .load(url)
                .apply(RequestOptions.placeholderOf(loadImageRes).centerCrop())
                .into(this)
    }
}