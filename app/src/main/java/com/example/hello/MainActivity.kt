package com.example.hello

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainbinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()
        binding.btnNext.set{
            val Intent =Intent( this,SecondBirdActvity::class.Java)
            startActivity(intent)

        }
        Picasso
            get()
            .load("https://images.unsplash.com/photo-1702550005130-764dd504fb0d?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGJpcmQlMjBpbWFnZXxlbnwwfHwwfHx8MA%3D%3D")
            .into(binding.imageView)
    }
}
