package boxcompose.ca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.Indication
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import boxcompose.ca.ui.theme.BoxComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxComposeTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ){
                    Avatar()
                    Indicator(Modifier)
                }
            }
        }
    }
}

@Composable
fun Indicator(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .clip(CircleShape)
            .background(Color.Green)
            .size(25.dp),
        Alignment.Center
    ){
        Text(
            text = "99+",
            style = TextStyle(
                fontWeight = FontWeight.Bold
            ),
            fontSize = 12.sp
        )
    }
}

@Composable
fun Avatar(modifier: Modifier = Modifier){
    Card(
        modifier = modifier
            .requiredSize(90.dp),
        shape = CircleShape,
        elevation = 2.dp
    ){
        Image(
            painterResource(R.drawable.photo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(90.dp)
        )
    }
}


