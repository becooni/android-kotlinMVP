package com.jake.kotlinsample.view.main.home.presenter

import android.os.AsyncTask
import com.jake.kotlinsample.data.source.image.ImageRepository

/**
 * @author Jake
 * Created by Jake on 2018-05-05 005.
 */
class HomePresenter(val view: HomeContract.View,
                    private val imageRepository: ImageRepository) : HomeContract.Presenter {

    override fun loadImage() {
        ImageAsyncTask(view, imageRepository).execute()
    }

    class ImageAsyncTask(val view: HomeContract.View,
                         private val imageRepository: ImageRepository) : AsyncTask<Unit, Unit, Unit>() {


        override fun doInBackground(vararg params: Unit?) {
            Thread.sleep(1000)
        }

        override fun onPreExecute() {
            super.onPreExecute()

            view.showProgress()
        }

        override fun onPostExecute(result: Unit?) {
            super.onPostExecute(result)

            view.hideProgress()

            imageRepository.loadImageFileName {
                view.showImage(it)
            }

        }
    }
}