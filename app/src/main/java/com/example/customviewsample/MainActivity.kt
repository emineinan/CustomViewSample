package com.example.customviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customviewsample.databinding.ActivityMainBinding
import com.example.customviewsample.view.MobilerdevCardModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        createCustomCardView()
    }

    private fun createCustomCardView() {
        binding.mobilerdevCardFirst.initCardView(
            MobilerdevCardModel(
                R.drawable.mentoring,
                R.string.mentoring,
                R.string.mentoring_description
            )
        )

        binding.mobilerdevCardTwo.initCardView(
            MobilerdevCardModel(
                R.drawable.robowars,
                R.string.robowars,
                R.string.robowars_description
            )
        )

        binding.mobilerdevCardThird.initCardView(
            MobilerdevCardModel(
                R.drawable.job_opportunities,
                R.string.job_opportunities,
                R.string.job_opportunities_description
            )
        )
    }
}