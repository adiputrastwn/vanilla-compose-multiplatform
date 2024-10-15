package com.usetada.compose.vanilla

import android.os.Build
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()

@Composable
actual fun WebViewKit(modifier: Modifier) {
    Text("WebViewKit")
}