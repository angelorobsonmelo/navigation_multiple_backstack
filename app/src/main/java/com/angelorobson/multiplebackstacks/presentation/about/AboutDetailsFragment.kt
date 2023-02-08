package com.angelorobson.multiplebackstacks.presentation.about

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.angelorobson.multiplebackstacks.R
import com.angelorobson.multiplebackstacks.databinding.FragmentAboutBinding
import com.angelorobson.multiplebackstacks.databinding.FragmentAboutDetailsBinding


class AboutDetailsFragment : Fragment() {


    private var _binding: FragmentAboutDetailsBinding? = null
    private val binding: FragmentAboutDetailsBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentAboutDetailsBinding.inflate(
        inflater,
        container,
        false
    ).apply {
        _binding = this
    }.root

}