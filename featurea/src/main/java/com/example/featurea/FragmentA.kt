package com.example.featurea

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.featurea.databinding.FragmentABinding
import com.example.navigation.Navigator

class FragmentA : Fragment() {
    private lateinit var binding: FragmentABinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate<FragmentABinding>(
            inflater,
            R.layout.fragment_a,
            container,
            false
        )
        binding.continuar.setOnClickListener(
            Navigator().toFragmentB()
        )

        return binding.root
    }
}