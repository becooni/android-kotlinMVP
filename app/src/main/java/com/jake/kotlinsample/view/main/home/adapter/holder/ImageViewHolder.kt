package com.jake.kotlinsample.view.main.home.adapter.holder

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jake.kotlinsample.R
import com.jake.kotlinsample.data.ImageData
import kotlinx.android.synthetic.main.item_image_view.view.*

/**
 * @author Jake
 * Created by Jake on 2018-05-18 018.
 */
class ImageViewHolder(context: Context, parent: ViewGroup?)
    : RecyclerView.ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_image_view, parent, false)) {

    fun onBind(item: ImageData) {
        itemView.onBind(item)
    }

    private fun View.onBind(item: ImageData) {
        tv_title.text = item.name
//        iv_view.setImageResource(resources.getIdentifier(item.fileName, "drawable", context.packageName))
        iv_view.loadImage(item.fileName)
    }
}