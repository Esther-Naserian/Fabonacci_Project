package com.example.fibonacciproject

import android.os.Binder
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fibonacciproject.databinding.ActivityMainBinding
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val number = addNumbers(100)
        binding.tvNumbers.layoutManager=GridLayoutManager(this,2)
        val adapterNums= SequenceNumbers(number)
        binding.tvNumbers.adapter=adapterNums


    }
    fun addNumbers(num:Int):List<BigInteger>{
        val number = mutableListOf(BigInteger.ZERO,BigInteger.ONE)
        while (number.size < num){
            number.add(number[number.lastIndex]+number[number.lastIndex -1])
        }
        return number
    }
}