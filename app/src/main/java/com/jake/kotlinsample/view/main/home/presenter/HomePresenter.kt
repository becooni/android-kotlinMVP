package com.jake.kotlinsample.view.main.home.presenter

import android.os.AsyncTask
import com.jake.kotlinsample.data.source.image.ImageRepository
import com.jake.kotlinsample.view.main.home.adapter.model.ImageRecyclerModel

/**
 * @author Jake
 * Created by Jake on 2018-05-05 005.
 */
class HomePresenter(val view: HomeContract.View,
                    private val imageRepository: ImageRepository,
                    private val imageRecyclerModel: ImageRecyclerModel) : HomeContract.Presenter {

    var isLoading = false

    override fun loadImage() {
        ImageAsyncTask(this, view, imageRepository, imageRecyclerModel).execute()
    }

    class ImageAsyncTask(val homePresenter: HomePresenter,
                         val view: HomeContract.View,
                         private val imageRepository: ImageRepository,
                         private val imageRecyclerModel: ImageRecyclerModel) : AsyncTask<Unit, Unit, Unit>() {


        override fun doInBackground(vararg params: Unit?) {
            imageRepository.loadImageFileName({
                it.forEach {
                    imageRecyclerModel.addItem(it)
                }
            }, 10)
            Thread.sleep(1000)
        }

        override fun onPreExecute() {
            super.onPreExecute()

                homePresenter.isLoading = true
            view.showProgress()
        }

        override fun onPostExecute(result: Unit?) {
            super.onPostExecute(result)

            imageRecyclerModel.notifyDataSetChange()
            view.hideProgress()
            homePresenter.isLoading = false
        }
    }
}