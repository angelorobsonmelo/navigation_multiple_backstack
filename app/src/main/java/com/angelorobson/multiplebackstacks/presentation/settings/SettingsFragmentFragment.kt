package com.angelorobson.multiplebackstacks.presentation.settings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.angelorobson.multiplebackstacks.R
import com.angelorobson.multiplebackstacks.databinding.FragmentHomeBinding
import com.angelorobson.multiplebackstacks.databinding.FragmentSettingsBinding
import com.angelorobson.multiplebackstacks.presentation.home.HomeFragmentDirections


class SettingsFragmentFragment : Fragment() {


    private var _binding: FragmentSettingsBinding? = null
    private val binding: FragmentSettingsBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentSettingsBinding.inflate(
        inflater,
        container,
        false
    ).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.settingsDetailsButton.setOnClickListener {
            val action = SettingsFragmentFragmentDirections.actionToSettingsDetailsFragment()
            findNavController().navigate(action)
        }
    }

}