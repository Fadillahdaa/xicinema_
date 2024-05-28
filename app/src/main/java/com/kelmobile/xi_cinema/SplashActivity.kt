package com.kelmobile.xi_cinema

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View

class SplashAkctivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up ConstraintLayout constraints
        setupConstraints()

        // Tampilkan loading screen
        loadingProgressBar.visibility = View.VISIBLE

        // Lakukan loading data
        loadData()
    }

    private fun setupConstraints() {
        // Set constraints for loading screen elements
        val loadingProgressBarLayoutParams = loadingProgressBar.layoutParams as ConstraintLayout.LayoutParams
        loadingProgressBarLayoutParams.startToStartOf = ConstraintLayout.LayoutParams.PARENT_ID
        loadingProgressBarLayoutParams.endToEndOf = ConstraintLayout.LayoutParams.PARENT_ID
        loadingProgressBarLayoutParams.topToTopOf = ConstraintLayout.LayoutParams.PARENT_ID
        loadingProgressBarLayoutParams.bottomToBottomOf = ConstraintLayout.LayoutParams.PARENT_ID

        // Set constraints for app logo
        val appLogoLayoutParams = appLogoImageView.layoutParams as ConstraintLayout.LayoutParams
        appLogoLayoutParams.startToStartOf = ConstraintLayout.LayoutParams.PARENT_ID
        appLogoLayoutParams.endToEndOf = ConstraintLayout.LayoutParams.PARENT_ID
        appLogoLayoutParams.topToBottomOf = loadingProgressBar
        appLogoLayoutParams.bottomToTopOf = welcomeTextView

        // Set constraints for welcome text
        val welcomeTextViewLayoutParams = welcomeTextView.layoutParams as ConstraintLayout.LayoutParams
        welcomeTextViewLayoutParams.startToStartOf = ConstraintLayout.LayoutParams.PARENT_ID
        welcomeTextViewLayoutParams.endToEndOf = ConstraintLayout.LayoutParams.PARENT_ID
        welcomeTextViewLayoutParams.topToTopOf = appLogoImageView
        welcomeTextViewLayoutParams.bottomToBottomOf = welcomeTextView

        loadingProgressBar.layoutParams = loadingProgressBarLayoutParams
        appLogoImageView.layoutParams = appLogoLayoutParams
        welcomeTextView.layoutParams = welcomeTextViewLayoutParams
    }

    private fun loadData() {
        // Simulasikan proses loading data
        Thread.sleep(2000)

        // Sembunyikan loading screen
        loadingProgressBar.visibility = View.GONE

        // Tampilkan konten aplikasi
        // ...
    }
}
}