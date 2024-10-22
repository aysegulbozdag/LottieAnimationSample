package com.example.lottieanimationsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.lottieanimationsample.ui.theme.LottieAnimationsampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LottieAnimationsampleTheme {
                val composition by rememberLottieComposition(
                    spec = LottieCompositionSpec.Url("https://lottie.host/1be691b8-8dbe-47c0-b350-d679fc75d7c7/yGBzDnoH90.json")
                    //spec = LottieCompositionSpec.RawRes(R.raw.animation_breathe)
                )

                LottieAnimation(
                    composition = composition,
                    iterations = LottieConstants.IterateForever,

                    )
            }
        }
    }
}