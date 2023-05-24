package com.example.activitybelajar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitybelajar.databinding.ActivityMain2Binding
import com.example.activitybelajar.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)

        val name = intent.getStringExtra("nama")
        binding.nama.text = name.toString()
        setContentView(binding.root)
    }
}