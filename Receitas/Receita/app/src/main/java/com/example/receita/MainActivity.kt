package com.example.receita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.receita.ui.theme.ReceitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReceitaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ReceitasCard()

                }
            }
        }
    }
}

@Composable
fun ReceitasCard() {
        Column(
            Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(top = 35.dp)
        )
        {
            Text(
                text = stringResource(id = R.string.title_receitas),
                fontFamily = FontFamily.Cursive,
                fontSize = 40.sp,
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 40.dp)
                    .wrapContentWidth(Alignment.CenterHorizontally)
            )
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp
                ),
                modifier = Modifier
                    .size(width = 700.dp, height = 685.dp)
                    .padding(horizontal = 35.dp)

            )
            {
                Text(
                    text =  "   Ingredientes para \n" +
                            "        a Massa:",
                    modifier = Modifier.padding(25.dp),
                    fontFamily = FontFamily.Cursive,
                    style = MaterialTheme.typography.headlineSmall,
                    fontSize = 32.sp,
                    color = Color.Black
                )
                Text(
                    text =  " - 1/2 xícara (chá) de óleo;\n" +
                            " - 3 cenouras médias raladas;\n" +
                            " - 4 ovos;\n" +
                            " - 2 xícaras (chá) de açúcar;\n" +
                            " - 2 e 1/2 xícaras (chá) de farinha de trigo;\n" +
                            " - 1 colher (sopa) de fermento em pó;",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.headlineSmall,
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.Black
                )
                Text(
                    text =  "     Ingredientes para a\n" +
                            "           Cobertura\n",
                    fontFamily = FontFamily.Cursive,
                    style = MaterialTheme.typography.headlineSmall,
                    fontSize = 32.sp,
                    color = Color.Black
                )
                Text(
                    text =  " - 1 colher (sopa) de manteiga\n" +
                            " - 3 colheres (sopa) de chocolate em pó\n" +
                            " - 1 xícara (chá) de açúcar\n" +
                            " - 1 xícara (chá) de leite",
                    modifier = Modifier.padding(horizontal = 16.dp),
                    style = MaterialTheme.typography.headlineSmall,
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.Black
                )
            }
        }
}

@Preview(showBackground = true)
@Composable
fun ReceitasTitlePreview() {
    ReceitaTheme {
        ReceitasCard()
    }
}