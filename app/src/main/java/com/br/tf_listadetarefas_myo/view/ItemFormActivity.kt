package com.br.tf_listadetarefas_myo.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.br.tf_listadetarefas_myo.ItemFormViewModel
import com.br.tf_listadetarefas_myo.R
import com.br.tf_listadetarefas_myo.databinding.ActivityItemFormBinding

private lateinit var binding: ActivityItemFormBinding
private lateinit var myViewModel: ItemFormViewModel

class ItemFormActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myViewModel = ViewModelProvider(this).get(ItemFormViewModel::class.java)

        setListeners()
    }

    private fun setListeners() {
        binding.buttonSave.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val id = v.id
        if (id == R.id.buttonSave) {

        }
    }
}