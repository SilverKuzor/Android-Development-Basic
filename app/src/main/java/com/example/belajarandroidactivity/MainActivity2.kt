package com.example.androidbelajar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myprojectandorid.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val judulForm:TextView = findViewById(R.id.judulFormulir)
        val labelNama:TextView = findViewById(R.id.labelNama)
        val inputNama:EditText = findViewById(R.id.inputNama)
        val labelKelas:TextView = findViewById(R.id.labelKelas)
        val inputKelas:EditText = findViewById(R.id.inputKelas)
        val labelKode:TextView = findViewById(R.id.labelKode)
        val inputKode:EditText =findViewById(R.id.inputKode)
        val btnSubmit: Button = findViewById(R.id.btnSubmit)
        val nama:TextView = findViewById(R.id.munculNama)
        val kelas:TextView = findViewById(R.id.munculKelas)
        val buku:TextView = findViewById(R.id.munculBuku)


        btnSubmit.setOnClickListener {

            val kode:Int = inputKode.text.toString().toInt()
            nama.text = inputNama.text
            kelas.text = inputKelas.text
            when(kode){
                123 -> buku.text = "harry potter"
                456 -> buku.text = "Alice wonderland"
                else -> buku.text = "Buku tak ada"
            }
            buku.text
            Toast.makeText(this, "Kamu pinjam buku ${buku.text}", Toast.LENGTH_SHORT
            ).show()

        }
    }
}