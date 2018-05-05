package com.jake.kotlinsample.data.source.image

import com.jake.kotlinsample.util.random

/**
 * @author Jake
 * Created by Jake on 2018-05-05 005.
 */
class ImageLocalData : ImageDataSource {
    override fun loadImageFileName(fileName: (String) -> Unit) {
        fileName(String.format("sample_%02d", (1..10).random()))
    }
}