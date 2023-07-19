package com.codemobiles.cmmvvm101.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class MainViewModel: ViewModel() {
    val count = MutableStateFlow<Int>(0)
}