package com.codemobiles.cmmvvm101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.codemobiles.cmmvvm101.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUIEvent()
    }

    private fun setUIEvent() {
        binding.countBtn.setOnClickListener {
            Toast.makeText(applicationContext, "Hey", Toast.LENGTH_SHORT).show()
        }
    }
}