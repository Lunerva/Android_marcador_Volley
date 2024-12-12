package com.example.android_final.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.android_final.components.PersonaButton


@Composable
fun MarcadorView(navController: NavController) {
    //define el estado de los puntos y sets para los equipos
    var puntosEquipoA by remember { mutableStateOf(0) }
    var puntosEquipoB by remember { mutableStateOf(0) }
    var setsEquipoA by remember { mutableStateOf(0) }
    var setsEquipoB by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween, //distribuye uniformemente los elementos
        horizontalAlignment = Alignment.CenterHorizontally //centra horizontalmente
    ) {
        //muestra los marcadores de ambos equipos
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            EquipoMarcador("equipo a", puntosEquipoA, setsEquipoA) { puntosEquipoA += it }
            EquipoMarcador("equipo b", puntosEquipoB, setsEquipoB) { puntosEquipoB += it }
        }
        //boton para guardar el marcador
        PersonaButton(
            text = "guardar marcador",
            onClick = {
                //insertar logica para guardar datos
            }
        )

        //boton para reiniciar el marcador
        PersonaButton(
            text = "reiniciar marcador",
            onClick = {
                puntosEquipoA = 0
                puntosEquipoB = 0
                setsEquipoA = 0
                setsEquipoB = 0
            }
        )
    }
}

@Composable
fun EquipoMarcador(
    equipo: String,
    puntos: Int,
    sets: Int,
    onPuntosChange: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, //centra el contenido horizontalmente
        modifier = Modifier
            .padding(16.dp)
            .clip(RoundedCornerShape(12.dp)) //bordes redondeados
            .background(Color(0xFF00E4FF)) //fondo de color...
            .padding(16.dp)
    ) {
        //nombre del equipo
        Text(
            text = equipo.uppercase(),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color.White, //texto en blanco
            style = MaterialTheme.typography.headlineLarge // tipografía personalizada
        )
        //puntos actuales
        Text(
            text = "puntos: $puntos",
            fontSize = 18.sp,
            color = Color.White, //texto en blanco
            modifier = Modifier.padding(top = 8.dp),
            style = MaterialTheme.typography.headlineLarge // tipografía personalizada
        )
        //sets ganados
        Text(
            text = "sets: $sets",
            fontSize = 18.sp,
            color = Color.White, //texto en blanco
            modifier = Modifier.padding(top = 8.dp),
            style = MaterialTheme.typography.headlineLarge // tipografía personalizada
        )

        //botones para ajustar puntos
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly, //espacia los botones uniformemente
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        ) {
            PersonaButton(text = "-1", onClick = { onPuntosChange(-1) })
            PersonaButton(text = "+1", onClick = { onPuntosChange(1) })
        }
    }
}
