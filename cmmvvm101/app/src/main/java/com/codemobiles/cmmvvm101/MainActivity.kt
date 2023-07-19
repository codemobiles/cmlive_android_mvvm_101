package com.codemobiles.cmmvvm101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUIEvent()
    }

    private fun setUIEvent() {
        val countBtn = findViewById<Button>(R.id.countBtn)
        countBtn.setOnClickListener {
            Toast.makeText(applicationContext, "Hey", Toast.LENGTH_SHORT).show()
        }
    }
}