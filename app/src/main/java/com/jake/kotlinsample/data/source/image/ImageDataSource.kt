package com.jake.kotlinsample.data.source.image

import com.jake.kotlinsample.data.ImageData

/**
 * @author Jake
 * Created by Jake on 2018-05-05 005.
 */
interface ImageDataSource {
    fun loadImageFileName(imageDataList: (List<ImageData>) -> Unit, size: Int)
}