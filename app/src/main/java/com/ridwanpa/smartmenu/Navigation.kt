package com.ridwanpa.smartmenu

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ridwanpa.smartmenu.screens.*

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.VerifyCodeScreen.name ) {
        composable(route = Routes.OnBoardingScreen.name) {
            OnBoardingScreen(navController)
        }
        composable(route = Routes.AuthenticationScreen.name) {
            AuthenticationScreen(navController)
        }
        composable(route = Routes.EmailVerificationScreen.name) {
            EmailVerification(navController)
        }
        composable(route = Routes.CreateAccountScreen.name) {
            CreateAccountScreen(navController )
        }
        composable(route = Routes.VerifyCodeScreen.name) {
            VerifyCodeScreen(navController)
        }
    }

}