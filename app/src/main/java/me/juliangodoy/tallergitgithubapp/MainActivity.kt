package me.juliangodoy.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity

import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.juliangodoy.tallergitgithubapp.ui.theme.Pink40




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfileCard()
                }
            }
        }
    }
}

@Composable
fun ProfileCard() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = MaterialTheme.shapes.large,
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Imagen circular
            Image(
                painter = painterResource(id = R.drawable.juliang),
                contentDescription = "Foto de perfil",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(Color.LightGray)
            )
            Spacer(modifier = Modifier.height(16.dp))

            Divider()

            Spacer(modifier = Modifier.height(16.dp))


            // Nombre en negrita
            Text(
                text = "Julian Godoy Arias",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            // Rol
            Text(
                text = "Ingenieria de sistemas",
                fontSize = 16.sp,
                color = Color.Gray
            )

            // Edad
            Text(text = "Edad", fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Text(text = "19 años")

            Spacer(modifier = Modifier.height(8.dp))

            // Correo
            Text(text = "Correo", fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Text(text = "Jgodoy218@unab.edu.co", color = MaterialTheme.colorScheme.primary)

            Spacer(modifier = Modifier.height(8.dp))

            // Ciudad
            Text(text = "Ciudad", fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Text(text = "Bucaramanga")

            Spacer(modifier = Modifier.height(16.dp))

            Divider()

            Spacer(modifier = Modifier.height(16.dp))

            // Sección descriptiva
            Text(
                text = "Mi Materia Favorita",
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Me gusta todo lo que tiene que ver con la programacion como la materia de tecnologias moviles, siento que desarrolla nuevos aprendizajes para mi",
                textAlign = TextAlign.Center
            )


            // Botón inferior
            Spacer(modifier = Modifier.height(250.dp))

            Button(
                onClick = { },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Contactar")

            }

        }
    }
}




