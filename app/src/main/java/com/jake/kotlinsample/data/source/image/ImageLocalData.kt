package com.jake.kotlinsample.data.source.image

import com.jake.kotlinsample.data.ImageData
import com.jake.kotlinsample.util.random

/**
 * @author Jake
 * Created by Jake on 2018-05-05 005.
 */
class ImageLocalData : ImageDataSource {
    override fun loadImageFileName(imageDataList: (List<ImageData>) -> Unit, size: Int) {
        val list = mutableListOf<ImageData>()
        for (index in 1..size) {
            val name = String.format("sample_%02d", (1..10).random())
            list.add(ImageData(name, name))
        }
        imageDataList(list)
    }
}