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
        binding.btnNext2.setOnClickListener{
            Val intent = Intent(this, ThirdBirdActivity::class.java)
            startActivity(intent)
        }
       picasso.get().load("https://images.unsplash.com/photo-1493236296276-d17357e28888?q=80&w=1171&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D").into(
    }
}
