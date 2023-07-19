package com.codemobiles.cmmvvm101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.codemobiles.cmmvvm101.databinding.ActivityMainBinding
import com.codemobiles.cmmvvm101.viewmodel.AppViewModelFactory
import com.codemobiles.cmmvvm101.viewmodel.MainViewModel

//  V--MV--M
class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var viewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val factory = AppViewModelFactory(context = applicationContext)
        viewModel = ViewModelProvider(this, factory).get(MainViewModel::class.java)


        binding.countBtn.text = "Count ${viewModel.count.value}"
        setUIEvent()
    }

    private fun setUIEvent() {
        binding.countBtn.setOnClickListener {
            viewModel.count.value = viewModel.count.value + 1
            binding.countBtn.text = "Count ${viewModel.count.value}"
        }
    }
}