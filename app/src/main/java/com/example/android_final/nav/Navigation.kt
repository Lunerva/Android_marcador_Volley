package com.example.android_final.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.android_final.onboarding.OnboardingView
import com.example.android_final.splashArt.SplashView
import com.example.android_final.views.MarcadorView
import com.example.app_volleyball_finalandroid.views.MenuView

@Composable
fun appNavigation(navController: NavHostController){
    NavHost(navController = navController, startDestination = "/splash"){
        composable("/splash"){
            SplashView(navController = navController)

        }
        composable("/onboarding"){
            OnboardingView(navController = navController)

        }
        composable("/menu"){
            MenuView(navController)

        }
        composable("/marcador"){
            MarcadorView(navController)

        }
        composable("/historial"){

        }

    }

}