@file:OptIn(ExperimentalForeignApi::class)

package com.usetada.compose.vanilla

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.UIKitView
import androidx.compose.ui.viewinterop.UIKitInteropProperties
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.readValue
import platform.CoreGraphics.CGRectZero
import platform.Foundation.NSURL
import platform.Foundation.NSURLRequest
import platform.UIKit.UIView
import platform.WebKit.WKWebView
import platform.WebKit.WKWebViewConfiguration

@Composable
actual fun WebViewKit(modifier: Modifier) {


    val factory = {
        val webView = WKWebView(frame = CGRectZero.readValue())
        webView.loadRequest(NSURLRequest(uRL = NSURL(string = "https://youtu.be/lp8YdIeAcc4")))
        webView
    }

    UIKitView(
        factory = factory,
        modifier = modifier.fillMaxSize(),
        update = { },
        onRelease = { },
        properties = UIKitInteropProperties(
            isInteractive = true,
            isNativeAccessibilityEnabled = true
        )
    )
}