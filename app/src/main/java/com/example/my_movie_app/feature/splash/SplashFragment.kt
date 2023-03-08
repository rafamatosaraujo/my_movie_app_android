package com.example.my_movie_app.feature.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.my_movie_app.R
class SplashFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {}
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_splash, container, false)

        setupView()

        return view
    }

    private fun setupView() {
        Handler(Looper.getMainLooper()).postDelayed({
            navigateTpHome()
        }, 1000)
    }

    private fun navigateTpHome() {
        findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToHome())
    }

}