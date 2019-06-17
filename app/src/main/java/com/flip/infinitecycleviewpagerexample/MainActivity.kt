package com.flip.infinitecycleviewpagerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Inifinite View Pager
    internal var movieList: MutableList<Movie> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        val adapter = MyAdapter(this, movieList)
        view_pager.adapter = adapter
    }

    private fun initData() {
        movieList.add(Movie("A Q U A M A N", getString(R.string.long_text), R.drawable.one))
        movieList.add(Movie("B A T M A N", getString(R.string.long_text), R.drawable.two))
        movieList.add(Movie("S P I D E R M A N", getString(R.string.long_text), R.drawable.three))
    }
}
