package com.example.udemytraining.presentation.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.udemytraining.R
import com.example.udemytraining.ui.theme.Orange
import com.example.udemytraining.ui.theme.Purple200

@Composable
fun SplashScreen(navController: NavHostController) {

}

@Composable
fun Splash() {
    if (isSystemInDarkTheme()) {
        Box(
            modifier = androidx.compose.ui.Modifier
                .background(Purple200)
                .fillMaxSize(),
            contentAlignment = Alignment.Center

        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_kanji),
                contentDescription = stringResource(
                    R.string.app_logo
                )
            )
        }
    } else {
        Box(
            modifier = androidx.compose.ui.Modifier
                .background(Orange)
                .fillMaxSize(),
            contentAlignment = Alignment.Center

        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_kanji),
                contentDescription = stringResource(
                    R.string.app_logo
                )
            )
        }
    }
}

@Composable
@Preview
fun SplashScreenPreview() {
    Splash()
}