package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.Doa
import com.example.belajarandroidactivity.model.Language
import com.example.myprojectandorid.R

class DashboardDoaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_doa)
        val rvDoa: RecyclerView = findViewById(R.id.rvDoa)
        val btnLengkap: Button = findViewById(R.id.btnLengkap)

        val data = arrayListOf<Doa>(
            Doa("Doa Makan",R.drawable.logo_doa),
            Doa("Doa tidur",R.drawable.logo_doa),
            Doa("Dzikir Pagi",R.drawable.logo_doa),
            Doa("Dzikir Sore",R.drawable.logo_doa),
            Doa("Dzikir Sholat",R.drawable.logo_doa),
            Doa("Niat Sholat wajib",R.drawable.logo_doa),
            Doa("Niat Sholat sunnah",R.drawable.logo_doa),
            Doa("Niat puasa",R.drawable.logo_doa)


            )
        val adapter = DoaAdapter(data)
        rvDoa.adapter = adapter
        rvDoa.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)
        btnLengkap.setOnClickListener {
            val intent = Intent(this,DoaHarianActivity::class.java)
            startActivity(intent)
        }
    }

}