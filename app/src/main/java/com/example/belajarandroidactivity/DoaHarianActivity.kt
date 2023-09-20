package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.adapter.DoaHarianAdapter
import com.example.belajarandroidactivity.model.Doa
import com.example.belajarandroidactivity.model.DoaHarian
import com.example.myprojectandorid.R

class DoaHarianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        val rvDoaHarian: RecyclerView = findViewById(R.id.rvDoaHarian)
        val btnComeBack: Button = findViewById(R.id.btnComeBack)

        val data = arrayListOf<DoaHarian>(
            DoaHarian("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ", "Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar"),
            DoaHarian("Doa Sesudah Makan","اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ", "Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alnaa muslimiin"),
            DoaHarian("Doa Sesudah Makan","اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ", "Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alnaa muslimiin")

        )
        val adapter = DoaHarianAdapter(data)
        rvDoaHarian.adapter = adapter
        rvDoaHarian.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)
        btnComeBack.setOnClickListener {
            val intent = Intent(this,DashboardDoaActivity::class.java)
            startActivity(intent)
        }


    }
}