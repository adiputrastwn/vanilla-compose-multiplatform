package com.usetada.compose.vanilla

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.multiplatform.webview.web.WebView
import com.multiplatform.webview.web.rememberWebViewStateWithHTMLData
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val html =
            "<div><u><span style=\"font-weight: 700;\">What is Traveloka Points?</span></u></div>\n\n<div>&nbsp;</div>\n\n<div><a href=\"http://www.google.com\">link google</a></div>\n\n<div>&nbsp;</div>\n\n<div>Traveloka Points is a reward program that we created to value our most loyal customers. This program allows you to earn Points each time you make a Flight, Hotel, Flight + Hotel or Xperience transaction on Traveloka, and redeem them for a discount on your next transactions. So, what are you waiting for? Earn your Points now!</div>\n\n<div>&nbsp;</div>\n\n<div><u><span style=\"font-weight: 700;\">What can I use my Points for?</span></u></div>\n\n<div>You can redeem your Points for Traveloka Rewards and Reward Coupons. Traveloka Rewards are discounts on Flight, Hotel, Flight + Hotel and Xperience. Meanwhile, Reward Coupons are special offers from our top merchants, available on Traveloka App version 3.2 and above.</div>\n\n<div>&nbsp;</div>\n\n<div><u><span style=\"font-weight: 700;\">Can Points expire? If so, how long are they valid for?</span></u></div>\n\n<div>Points are valid for one (1) year since their activation date. You may check your Points&rsquo; status and expiration date in My Points.</div>\n\n<div>&nbsp;</div>\n\n<div><img alt=\"\" height=\"64\" src=\"https://ik.imagekit.io/tvlk/image/imageResource/2018/08/27/1535365836389-1948cb4e4645afa5fefa6e780ba23531.png\" style=\"width: 772px; height: 496px;\" width=\"100\" /></div>\n"
        val webViewState = rememberWebViewStateWithHTMLData(defaultHtmlStyle.format(html)).apply {
            webSettings.isJavaScriptEnabled = true
        }

        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            WebView(
                modifier = Modifier.fillMaxSize(),
                state = webViewState
            )
        }
    }
}