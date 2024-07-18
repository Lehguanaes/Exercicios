package com.example.formulario_receitas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.formulario_receitas.ui.theme.Formulario_ReceitasTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Formulario_ReceitasTheme {

                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    App ();
                }
            }
        }
    }
}

@Composable
fun App(){

    var nome by remember { mutableStateOf("") }
    var ingredientes by remember { mutableStateOf("") }
    var preparo by remember { mutableStateOf("") }

    Column (
        Modifier
            .fillMaxWidth()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (
            Modifier
                .padding(15.dp)
        ) {
        }
        Row (
            Modifier
                .padding(horizontal = 70.dp)
                .padding(bottom = 10.dp)
        ) {
            Text(text = "  Cadastre \n" +
                    "Sua Receita!",
                fontSize = 38.sp,
                style = TextStyle(
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                )
            )
        }
        Row (Modifier
            .padding(10.dp)
        )
        {
            OutlinedTextField(
                value = nome,
                onValueChange = { nome = it },
                label = { Text("Nome da Receita:",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)) }
            )
        }
        Row (
            Modifier
                .padding(10.dp)
        )
        {
            OutlinedTextField(
                value = ingredientes,
                onValueChange = { ingredientes = it },
                label = { Text("Ingredientes:",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 150.dp)) }
            )
        }
        Row (
            Modifier
                .padding(10.dp)
        )
        {
            OutlinedTextField(
                value = preparo,
                onValueChange = {  preparo = it },
                label = { Text("Modo de Preparo:",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 300.dp) ) }
            )
        }
        Row (
            Modifier
                .padding(top = 15.dp)
        )
        {
            Button(onClick = {}) {
                Text(
                    text = "Cadastrar Receita!", fontSize = 24.sp,
                    style = TextStyle(
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                    )
                )
            }
        }
    }
}

@Composable
@Preview
fun AppPreview (){
    Formulario_ReceitasTheme{
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            App ();
        }
    }
    App ();
}