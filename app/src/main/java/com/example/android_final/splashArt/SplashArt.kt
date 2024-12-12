package com.example.android_final.splashArt

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.android_final.R
import kotlinx.coroutines.delay


//INSERTAR IMAGEN FRAGMENTADA EN 3 PARTES PARA MOSTRAR CON ANIMACION
// Y SE VAYA FORMANDO
//FUERZAS ESPECIALES GINYU xd

@Composable
fun SplashView(navController: NavController){
    LaunchedEffect(Unit) {
        delay(6000)//6 seg
        navController.navigate("/onboarding"){
            popUpTo(0) //elimina el splash de la pila de nav para que el usuario no regrese
        }
    }
    Box (
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ){
        Image(painter = painterResource(id = R.drawable.fuerza_ginyu), contentDescription = "")
        Text(
            text = "INSERTAR Splash art",
            style = MaterialTheme.typography.headlineLarge // tipografía personalizada
        )

    }

}