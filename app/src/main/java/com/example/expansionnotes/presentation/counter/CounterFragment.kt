package com.example.expansionnotes.presentation.counter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.expansionnotes.databinding.FragmentCounterBinding


class CounterFragment : Fragment() {

    private var _binding: FragmentCounterBinding? = null
    private val mBinding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCounterBinding.inflate(layoutInflater, container, false)
        return (mBinding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}