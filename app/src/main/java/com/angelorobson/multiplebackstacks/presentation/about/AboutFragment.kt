package com.angelorobson.multiplebackstacks.presentation.about

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.angelorobson.multiplebackstacks.R
import com.angelorobson.multiplebackstacks.databinding.FragmentAboutBinding
import com.angelorobson.multiplebackstacks.databinding.FragmentHomeBinding


class AboutFragment : Fragment() {


    private var _binding: FragmentAboutBinding? = null
    private val binding: FragmentAboutBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentAboutBinding.inflate(
        inflater,
        container,
        false
    ).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.aboutDetailsButton.setOnClickListener {
            val action = AboutFragmentDirections.actionToAboutDetailsFragment()
            findNavController().navigate(action)
        }
    }

}