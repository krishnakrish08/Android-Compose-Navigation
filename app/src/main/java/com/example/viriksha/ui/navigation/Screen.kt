package com.example.viriksha.ui.navigation

import androidx.navigation.NavArgs

sealed class Screen(val route: String) {
    object Home : Screen(route = "home")
    object News : Screen(route = "news")
    object Profile : Screen(route = "profile")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}