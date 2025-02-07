package com.example.infopays.ui.navigation
import android.os.BaseBundle
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.infopays.HomeScreen
import com.example.infopays.InfoPaysApp
import kotlin.let
import kotlin.text.toIntOrNull

@Composable
fun NavigationGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }
        composable("principal_screen") { backStackEntry ->
            InfoPaysApp(navController)
        }
    }
}
