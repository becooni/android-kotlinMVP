package com.jake.kotlinsample.view.main.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jake.kotlinsample.R
import com.jake.kotlinsample.data.source.image.ImageRepository
import com.jake.kotlinsample.view.main.home.presenter.HomeContract
import com.jake.kotlinsample.view.main.home.presenter.HomePresenter
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * @author Jake
 * Created by Jake on 2018-05-05 005.
 */
class HomeFragment : Fragment(), HomeContract.View {

    private val homePresenter: HomePresenter by lazy {
        HomePresenter(this@HomeFragment, ImageRepository)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
            = inflater.inflate(R.layout.fragment_home, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homePresenter.loadImage()
    }

    override fun showImage(imageName: String) {
        imageView.setImageResource(resources.getIdentifier(imageName, "drawable", context?.packageName))
    }

    override fun showProgress() {
        progressBar.visibility = View.VISIBLE
    }


    override fun hideProgress() {
        progressBar.visibility = View.GONE
    }
}