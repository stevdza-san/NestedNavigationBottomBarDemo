package com.example.nestednavigationbottombardemo.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestednavigationbottombardemo.screens.LoginContent
import com.example.nestednavigationbottombardemo.screens.ScreenContent

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginContent(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Graph.HOME)
                },
                onSignUpClick = {
                    navController.navigate(AuthScreen.SignUp.route)
                },
                onForgotClick = {
                    navController.navigate(AuthScreen.Forgot.route)
                }
            )
        }
        composable(route = AuthScreen.SignUp.route) {
            ScreenContent(name = AuthScreen.SignUp.route) {}
        }
        composable(route = AuthScreen.Forgot.route) {
            ScreenContent(name = AuthScreen.Forgot.route) {}
        }
    }
}

sealed class AuthScreen(val route: String) {
    object Login : AuthScreen(route = "LOGIN")
    object SignUp : AuthScreen(route = "SIGN_UP")
    object Forgot : AuthScreen(route = "FORGOT")
}