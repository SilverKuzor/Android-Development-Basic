package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.myprojectandorid.R
import jp.wasabeef.glide.transformations.BlurTransformation

class BelajarScrollView : AppCompatActivity() {
    var ivBackground: ImageView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll_view)

        ivBackground = findViewById(R.id.ivBackgrounds)

        Glide.with(this)
            .load(R.drawable.untitled)
            .transform(BlurTransformation(6,3))
            .into(ivBackground!!)


    }
}