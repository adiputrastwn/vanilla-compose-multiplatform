package com.usetada.compose.vanilla

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb

internal val defaultHtmlStyle
    @Composable
    get() = WebHtmlStyle(
        MaterialTheme.colors.onBackground,
        MaterialTheme.colors.background)

internal fun removeHttpOrHttps(source: String?): String {
    var result = ""
    if (source != null) {
        result = source.replace("href=\"http://".toRegex(), "href=\"webtada://")
            .replace("href=\"https://".toRegex(), "href=\"webtada://")
    }
    return result
}

internal class WebHtmlStyle(textColor: Color, backgroundColor: Color) {
    private val text = "#" + textColor.toArgb().toString()
    private val back = "#" + backgroundColor.toArgb().toString()

    private val praContent = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "  <head>\n" +
            "    <title></title>\n" +
            "    <style>\n" +
            "       body {" +
            "           overflow-wrap: anywhere;" +
            "           font-size: 16px;" +
            "           background-color: $back;" +
            "           color: $text;" +
            "       }\n" +
            "      img{" +
            "        max-width: 100%;width:auto !important;height:auto !important;overflow:hidden;" +
            "      }" +
            "    </style>\n" +
            "  </head>\n" +
            "  <body><div class='wrapper'>"

    private val postContent = "</div></body>\n" + "</html>"

    fun format(content: String?): String {
        return praContent + removeHttpOrHttps(content) + postContent
    }
}