package com.jake.kotlinsample.view.main.home.presenter

/**
 * @author Jake
 * Created by Jake on 2018-05-05 005.
 */
interface HomeContract {
    interface View {
        fun showImage(imageName: String)
        fun showProgress()
        fun hideProgress()
    }

    interface Presenter {

        fun loadImage()

    }
}