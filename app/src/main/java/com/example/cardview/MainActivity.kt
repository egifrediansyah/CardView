package com.example.cardview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var ratingBar: RatingBar
    lateinit var ratingBar1: RatingBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ratingBar = findViewById(R.id.ratingbar) as RatingBar
        ratingBar1 = findViewById(R.id.ratingbar1) as RatingBar
    }
    fun click(view: View){
        val ratingvalue = ratingBar.rating
        Toast.makeText(this, "Oke Lah Bisa" + ratingvalue, Toast.LENGTH_LONG).show()
    }
}
