package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessApp()
                }
            }
        }
    }
}

@Composable
fun BusinessApp(){
    Card {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            MainInfo(name = "Teguh Pambudi", title = "Software Engineer wannabe")
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Column {
                    InfoCard(
                        phone = "+085123456789",
                        email = "teguhteguh@mail.com",
                        social = "@teguhteguh"
                    )
                }
            }
        }
    }
    }

@Composable
private fun MainInfo(name: String, title: String, modifier: Modifier = Modifier){
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        val image = painterResource(id = R.drawable._0230914_131009_removed_object_square)
        Image(painter = image, contentDescription = null, Modifier.width(128.dp))
        Text(text = name, fontWeight = FontWeight.Bold)
        Text(text = title, fontSize = 14.sp)
    }
}

@Composable
fun InfoCard(phone: String,email: String,social: String, modifier: Modifier = Modifier) {
        Row(modifier = modifier) {
            Icon(imageVector = Icons.Rounded.Phone, contentDescription = null, Modifier.size(15.dp))
            Text(text = phone, fontSize = 14.sp, modifier = Modifier.padding(start = 5.dp))
        }
        Row(modifier = modifier) {
            Icon(imageVector = Icons.Rounded.Email, contentDescription = null, Modifier.size(15.dp))
            Text(text = email, fontSize = 14.sp, modifier = Modifier.padding(start = 5.dp))
        }
        Row(modifier = modifier) {
            Icon(imageVector = Icons.Rounded.Person, contentDescription = null, Modifier.size(15.dp)
            )
            Text(text = social, fontSize = 14.sp, modifier = Modifier.padding(start = 5.dp))
        }
    }


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BusinessCardAppPreview() {
    BusinessCardAppTheme {
        BusinessApp()
    }
}