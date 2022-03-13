package com.example.collectingdialect.ui.content

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.collectingdialect.R
import com.example.collectingdialect.databinding.FragmentRegionSelectionBinding

class RegionSelectionFragment: Fragment(R.layout.fragment_region_selection) {
    private var binding: FragmentRegionSelectionBinding? = null
    private val viewModel: RegionSelectionViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(binding == null) {
            binding = DataBindingUtil.bind(view)
            binding?.viewModel = viewModel
        }

    }
}