package com.jake.kotlinsample.data.source.image

/**
 * @author Jake
 * Created by Jake on 2018-05-05 005.
 */
object ImageRepository : ImageDataSource {

    private val imageLocalData: ImageLocalData by lazy {
        ImageLocalData()
    }

    override fun loadImageFileName(fileName: (String) -> Unit) {
        imageLocalData.loadImageFileName(fileName)
    }
}