package com.codemobiles.cmmvvm101.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class MainViewModel(val context: Context): ViewModel() {
    val count = MutableStateFlow<Int>(0)

    fun add(){
        count.value = count.value + 1
    }
}