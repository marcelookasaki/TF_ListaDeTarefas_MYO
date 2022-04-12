package com.br.tf_listadetarefas_myo.ui.to_buy

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BoughtViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is to_buy Fragment"
    }
    val text: LiveData<String> = _text
}