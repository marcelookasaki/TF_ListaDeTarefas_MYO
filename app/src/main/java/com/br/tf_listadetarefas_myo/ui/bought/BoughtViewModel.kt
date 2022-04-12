package com.br.tf_listadetarefas_myo.ui.bought

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BoughtViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is bought Fragment"
    }
    val text: LiveData<String> = _text
}