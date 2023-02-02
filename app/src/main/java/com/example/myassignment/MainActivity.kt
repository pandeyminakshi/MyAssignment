package com.example.myassignment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myassignment.databinding.ActivityMainBinding
import com.example.mylibrary.MathOperation

class MainActivity : AppCompatActivity(), MathOperation {
    private lateinit var binding: ActivityMainBinding
    private var a = ""
    private var b = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var a = binding.edText1.text
        var b = binding.edText2.text

        binding.btnAddition.setOnClickListener {
            try {
                addition()
           // var c = addition(a.toString().toInt(), b.toString().toInt())
             //   startResultActivity(c)
            }catch (e: Exception) {
                println(e)
            }
        }

        binding.btnSub.setOnClickListener {

            try {
               subtraction()
            } catch (e: Exception) {
                println(e)
            }

        }

        binding.btnClear.setOnClickListener {
            binding.edText1.text.clear()
            binding.edText2.text.clear()
        }


    }

    private fun startResultActivity(c: Int) {
        val intent = Intent(this@MainActivity, ResultActivity::class.java)
        intent.putExtra("result", c.toString())
        startActivity(intent)
    }

    override fun addition() {
        a = binding.edText1.text.toString()
        b = binding.edText2.text.toString()

        var c:Int = a.toInt()+b.toInt()
        startResultActivity(c)
    }

    override fun subtraction() {
        a = binding.edText1.text.toString()
        b = binding.edText2.text.toString()

        var c:Int = a.toInt()-b.toInt()
        startResultActivity(c)
    }

}