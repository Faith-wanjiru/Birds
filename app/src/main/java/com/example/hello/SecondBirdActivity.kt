package com.example.hello

import android.app.Activity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: AcctivitySecondBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)setOnClickListener
        binding= ActivitySecondBirdBinding.Inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.btnPrev.setOnClickListener{
            finish()
        }
        binding.btnNext2.
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}