package com.jake.kotlinsample.data.source.image

import com.jake.kotlinsample.data.ImageData

/**
 * @author Jake
 * Created by Jake on 2018-05-05 005.
 */
object ImageRepository : ImageDataSource {

    private val imageLocalData: ImageLocalData by lazy {
        ImageLocalData()
    }

    private val imageRemoteData: ImageRemoteData by lazy {
        ImageRemoteData()
    }

    override fun loadImageFileName(imageDataList: (List<ImageData>) -> Unit, size: Int) {
//        imageLocalData.loadImageFileName(imageDataList, size)
        imageRemoteData.loadImageFileName(imageDataList, size)
    }
}