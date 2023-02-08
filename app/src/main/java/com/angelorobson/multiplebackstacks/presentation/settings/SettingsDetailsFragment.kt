package com.angelorobson.multiplebackstacks.presentation.settings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.angelorobson.multiplebackstacks.R
import com.angelorobson.multiplebackstacks.databinding.FragmentSettingsBinding
import com.angelorobson.multiplebackstacks.databinding.FragmentSettingsDetailsBinding


class SettingsDetailsFragment : Fragment() {


    private var _binding: FragmentSettingsDetailsBinding? = null
    private val binding: FragmentSettingsDetailsBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentSettingsDetailsBinding.inflate(
        inflater,
        container,
        false
    ).apply {
        _binding = this
    }.root

}