package com.sergio994350.portfoliotarasov.ui.work

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.sergio994350.portfoliotarasov.databinding.FragmentWorkBinding

class WorkFragment : Fragment() {

    private lateinit var workViewModel: WorkViewModel
    private var _binding: FragmentWorkBinding? = null

    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        workViewModel =
            ViewModelProvider(this).get(WorkViewModel::class.java)

        _binding = FragmentWorkBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMyWork
        workViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}