package com.usetada.compose.vanilla

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview

enum class CupcakeScreen {
    Start,
    Flavor,
    Pickup,
    Summary
}
@Composable
fun App() {
    MainScreen()
}

//@Composable
//@Preview
//fun App(navController: NavHostController = rememberNavController()) {
////    MainScreen()
//    MaterialTheme {
//        Scaffold { innerPadding ->
//            NavHost(
//                navController = navController,
//                startDestination = CupcakeScreen.Start.name,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .verticalScroll(rememberScrollState())
//                    .padding(innerPadding)
//            ) {
//                composable(route = CupcakeScreen.Start.name) {
//                    MainScreen()
//                }
//            }
//        }
//    }
//}