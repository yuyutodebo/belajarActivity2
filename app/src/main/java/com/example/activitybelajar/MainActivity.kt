package com.example.activitybelajar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitybelajar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.button.setOnClickListener(){
            sendMessage()
        }
        setContentView(binding.root)
    }
    fun sendMessage (){
        val nama = binding.etNama.text.toString()
        val inten = Intent(this,MainActivity2::class.java)
        inten.putExtra("nama", nama)
        startActivity(inten)
    }
}