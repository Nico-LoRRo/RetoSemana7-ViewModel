package com.example.counterapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CounterViewModel : ViewModel() {
    // Estado mutable privado
    private val _count = MutableStateFlow(0)

    // Estado inmutable expuesto a la UI
    val count: StateFlow<Int> = _count.asStateFlow()

    // Método para incrementar el contador
    fun increment() {
        _count.value++
    }
}
