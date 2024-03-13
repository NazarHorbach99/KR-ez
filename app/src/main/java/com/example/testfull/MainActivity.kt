package com.example.testfull
import com.example.testfull.R
import androidx.compose.foundation.layout.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.verticalScroll
import com.example.testfull.ui.theme.TESTFULLTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TESTFULLTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()),
                    color = Color(android.graphics.Color.parseColor("#006400")) // HEX-код для темно-зеленого
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting( modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Column(modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Image(
                painter = painterResource(id = R.drawable.frame1),
                contentDescription = "Phone",
                modifier = Modifier
                    .size(200.dp)
                    .padding(end = 10.dp)
            )
            Text(text = "Nazar Horbach ",
                modifier = Modifier.padding(bottom = 5.dp, start = 0.dp),
                fontSize = 36.sp)
            Text(text = "Best player ",
                fontSize = 20.sp)
        }

    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.padding(bottom = 10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.email),
                contentDescription = "Email",
                modifier = Modifier
                    .size(30.dp)
                        .padding(end = 1.dp)
            )
            Text(
                text = "nazar099143@gmail.com",
                fontSize = 25.sp
            )
        }
        Row(
            modifier = Modifier.padding(bottom = 10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.phone_font_awesome_svg),
                contentDescription = "Phone",
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 5.dp)
            )
            Text(
                text = "+380111111",
                fontSize = 25.sp
            )
        }
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.phone_font_awesome_svg),
                contentDescription = "Phone",
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 5.dp)
            )
            Text(
                text = "+325232134",
                fontSize = 25.sp
            )
        }
    }
}

 ///fff
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TESTFULLTheme {
        Greeting()
    }
}