package com.jake.kotlinsample.data.source.image

/**
 * @author Jake
 * Created by Jake on 2018-05-05 005.
 */
interface ImageDataSource {
    fun loadImageFileName(fileName: (String) -> Unit)
}