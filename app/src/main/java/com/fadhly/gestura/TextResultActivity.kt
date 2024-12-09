package com.fadhly.gestura

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fadhly.gestura.databinding.ActivityTextResultBinding

class TextResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTextResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTextResultBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // Retrieve and display the translated text
        val translatedText = intent.getStringExtra("TRANSLATED_TEXT")
        binding.tvResult.text = translatedText ?: "No translation available"
    }
}