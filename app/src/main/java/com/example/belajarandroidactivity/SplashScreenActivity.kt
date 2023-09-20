package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.myprojectandorid.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        //fungsi post delay untuk menjalankan action ketika
        // waktu yg ditentukan telah selesai
        Handler().postDelayed({
            val intent = Intent(this, DashboardDoaActivity::class.java)
            startActivity(intent)
        },5000)
    }
}