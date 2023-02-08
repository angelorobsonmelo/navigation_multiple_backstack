package com.angelorobson.multiplebackstacks.presentation.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.angelorobson.multiplebackstacks.R
import com.angelorobson.multiplebackstacks.databinding.FragmentHomeBinding
import com.angelorobson.multiplebackstacks.databinding.FragmentHomeDetailsBinding


class HomeDetailsFragment : Fragment() {


    private var _binding: FragmentHomeDetailsBinding? = null
    private val binding: FragmentHomeDetailsBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentHomeDetailsBinding.inflate(
        inflater,
        container,
        false
    ).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}