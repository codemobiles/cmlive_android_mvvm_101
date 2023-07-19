package com.codemobiles.cmmvvm101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.codemobiles.cmmvvm101.databinding.ActivityMainBinding

//  V--MV--M
class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.countBtn.text = "Count $count"
        setUIEvent()
    }

    private fun setUIEvent() {
        binding.countBtn.setOnClickListener {
            count++
            binding.countBtn.text = "Count $count"
        }
    }
}