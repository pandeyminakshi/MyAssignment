package com.example.myassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myassignment.databinding.ActivityMainBinding
import com.example.myassignment.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var result: String? = intent.getStringExtra("result")

        binding.tvResult.text ="Result is "+result
    }
}