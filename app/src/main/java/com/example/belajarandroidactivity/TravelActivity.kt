package com.example.belajarandroidactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.myprojectandorid.R

class TravelActivity : AppCompatActivity() {
    var ibCall : ImageButton? = null
    var ibNavigator : ImageButton? = null
    var ibShare : ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)
        ibCall = findViewById(R.id.call)
        ibNavigator = findViewById(R.id.nav)
        ibShare = findViewById(R.id.share)

        ibCall!!.setOnClickListener {
            val phoneNumber = "02345678"
            val phoneIntent = Intent(Intent.ACTION_DIAL,
                Uri.parse("tel: $phoneNumber"))
            startActivity(phoneIntent)
        }
        ibNavigator!!.setOnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:38.55322957011421, 35.50513752850368"))
            startActivity(mapIntent)
        }
        ibShare!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.setType("Text/plain")
            startActivity(Intent.createChooser(intent, "Share to :"))
        }

    }
}