package com.jake.kotlinsample.view.main.home.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.jake.kotlinsample.data.ImageData
import com.jake.kotlinsample.view.main.home.adapter.holder.ImageViewHolder
import com.jake.kotlinsample.view.main.home.adapter.model.ImageRecyclerModel

/**
 * @author Jake
 * Created by Jake on 2018-05-18 018.
 */
class ImageRecyclerAdapter(private val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>(), ImageRecyclerModel {
    private val list = mutableListOf<ImageData>()

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ImageViewHolder).onBind(list[position])
    }

    override fun getItemCount() = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ImageViewHolder(context, parent)
    }

    override fun addItem(imageData: ImageData) {
        list.add(imageData)
    }

    override fun notifyDataSetChange() {
        notifyDataSetChanged()
    }
}