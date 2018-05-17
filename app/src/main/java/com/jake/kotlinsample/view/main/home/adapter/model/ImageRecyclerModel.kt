package com.jake.kotlinsample.view.main.home.adapter.model

import com.jake.kotlinsample.data.ImageData

/**
 * @author Jake
 * Created by Jake on 2018-05-18 018.
 */
interface ImageRecyclerModel {

    fun addItem(imageData: ImageData)

    fun getItemCount(): Int

    fun notifyDataSetChange()
}