package com.example.udemytraining.domain.model

import androidx.annotation.DrawableRes
import com.example.udemytraining.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First : OnBoardingPage(
        image = R.drawable.greetings,
        title = "Greetings",
        description = "DBZ FAN?"
    )

    object Second : OnBoardingPage(
        image = R.drawable.explore,
        title = "Explore",
        description = "DBZ FAN -> explore?"
    )

    object Third : OnBoardingPage(
        image = R.drawable.power,
        title = "Power",
        description = "DBZ FAN? -> power"
    )
}