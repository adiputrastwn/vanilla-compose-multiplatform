package com.usetada.compose.vanilla

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform