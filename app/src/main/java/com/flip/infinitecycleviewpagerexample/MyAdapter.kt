package com.flip.infinitecycleviewpagerexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter

class MyAdapter(
    internal var context: Context,
    internal var movieList: List<Movie>
) : PagerAdapter() {


    override fun isViewFromObject(view: View, p1: Any): Boolean {
        return view == p1
    }

    override fun getCount(): Int {
        return movieList.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        // Inflate Layout
        val view = LayoutInflater.from(context).inflate(R.layout.card_item, container, false)

        // View

        val movie_image = view.findViewById<View>(R.id.movie_image) as ImageView
        val movie_title = view.findViewById<View>(R.id.movie_title) as TextView
        val movie_description = view.findViewById<View>(R.id.movie_description) as TextView

        //Set Data
        movie_image.setImageResource(movieList[position].image)
        movie_title.text = movieList[position].name
        movie_description.text = movieList[position].description

        //Events

        view.setOnClickListener {
            Toast.makeText(context, "" + movieList[position].name, Toast.LENGTH_LONG).show()
        }
        container.addView(view)
        return view

    }

}