package com.br.tf_listadetarefas_myo.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.br.tf_listadetarefas_myo.databinding.FragmentToBuyBinding
import com.br.tf_listadetarefas_myo.view_model.ToBuyViewModel

class ToBuyFragment : Fragment() {

    private var _binding: FragmentToBuyBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(ToBuyViewModel::class.java)

        _binding = FragmentToBuyBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textToBuy
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}