package com.example.android_final.onboarding

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.android_final.components.PersonaButton

//ONBOARDING ES COMO EL TUTORIAL
//PARA EL ONBOARDING MOSTREMOS 4 PANTALLAS
//1 EXPLICAR MENU
//2 EXPLICAR MARCADORES
//3 EXPLICAR HISTORIAL
//4 PROMOCION GOOGLE PLAY

@Composable
fun OnboardingView(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = "onboard BIENVENIDO!!",
            style = MaterialTheme.typography.headlineLarge // tipografía personalizada
            )
        Spacer(modifier = Modifier.height(16.dp))
        PersonaButton(text = "continuar", onClick = { navController.navigate("/menu")})

    }
}