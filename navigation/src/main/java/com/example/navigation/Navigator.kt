package com.example.navigation

import android.view.View
import androidx.navigation.Navigation
import com.example.featurea.FragmentADirections

class Navigator {
    fun toFragmentB(): View.OnClickListener {
        val action = FragmentADirections.actionFragmentAToFragmentB()
        return Navigation.createNavigateOnClickListener(action.actionId)
    }
}