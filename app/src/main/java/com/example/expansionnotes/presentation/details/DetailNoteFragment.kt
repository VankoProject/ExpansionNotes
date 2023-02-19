package com.example.expansionnotes.presentation.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.expansionnotes.databinding.FragmentDetailNoteBinding


class DetailNoteFragment : Fragment() {

    private var _binding: FragmentDetailNoteBinding? = null
    private val mBinding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailNoteBinding.inflate(layoutInflater, container, false)
        return (mBinding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}