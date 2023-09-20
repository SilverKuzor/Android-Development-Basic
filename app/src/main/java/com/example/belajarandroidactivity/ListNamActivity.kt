package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myprojectandorid.R

class ListNamActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama_activy)
        val arrayAdapter:ArrayAdapter<*>
        val users = arrayOf(
            "Steve Smith", "Ross Taylor", "Rohit Sharma"
        )
        var mListView:ListView = findViewById(R.id.lvNama)
        // panggil object array adapter
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            users)
        // isi adapter
        mListView.adapter = arrayAdapter
    }
}