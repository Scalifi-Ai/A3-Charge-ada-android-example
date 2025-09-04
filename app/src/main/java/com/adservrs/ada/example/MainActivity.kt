package com.adservrs.ada.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.adservrs.ada.AdaConfig
import com.adservrs.ada.AdaScaleType
import com.adservrs.ada.AdaView
import com.adservrs.ada.example.ui.theme.AdaExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AdaExampleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    AndroidView(
        factory = {
            val config = AdaConfig(
                pubId = "68540ce88ee8d56dbe0d78a6",
                tagId = "687e2ebbaeb2d8dd1003214c",
            )
            val view = AdaView(it)
            view.load(config)
            view
        },
        modifier = modifier.fillMaxSize(),
    )
}
