package com.fadhly.gestura.ui.onBoard

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fadhly.gestura.R
import com.fadhly.gestura.databinding.ActivityOnBoarding2Binding

class OnBoarding2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoarding2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoarding2Binding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.pt1.setOnClickListener {
            val intent = Intent(this, OnBoarding1Activity::class.java)
            startActivity(intent)
        }

        binding.pt3.setOnClickListener {
            val intent = Intent(this, OnBoarding3Activity::class.java)
            startActivity(intent)
        }

        binding.pt4.setOnClickListener {
            val intent = Intent(this, OnBoarding4Activity::class.java)
            startActivity(intent)
        }

        binding.viewNext.setOnClickListener {
            val intent = Intent(this, OnBoarding3Activity::class.java)
            startActivity(intent)
        }
        binding.viewBack.setOnClickListener {
            val intent = Intent(this, OnBoarding1Activity::class.java)
            startActivity(intent)
        }

    }
}