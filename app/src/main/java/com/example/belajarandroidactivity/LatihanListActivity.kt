package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myprojectandorid.R

class LatihanListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "1. Python",
            "2. C#",
            "3. C++",
            "4. JavaScript",
            "5. PHP",
            "6. Swift",
            "7. Java",
            "8. Go",
            "9. SQL",
            "10. Ruby"
        )
        var mListView: ListView = findViewById(R.id.lvNama)
        // panggil object array adapter
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            users)
        // isi adapter
        mListView.adapter = arrayAdapter
    }
}