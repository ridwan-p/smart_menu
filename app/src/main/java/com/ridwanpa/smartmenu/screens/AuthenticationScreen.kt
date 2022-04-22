package com.ridwanpa.smartmenu.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ridwanpa.smartmenu.R

@Composable
fun AuthenticationScreen(navController: NavController) {
    Column() {
        Column(
            Modifier.weight(1f),
            verticalArrangement = Arrangement.Center
        ) {
            Column(
                Modifier
                    .padding(24.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Let’s Get Started \uD83D\uDE01",
                    fontSize = 26.sp,
                    color = Color(0xFF32324D)
                )
                Spacer(modifier = Modifier.height(14.dp))
                Text(
                    text = "Sign up or login into to have a full digital experience in our restaurant",
                    color = Color(0xFF8E8EA9),
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(56.dp))
            Column(
                Modifier
                    .padding(24.dp)
            ) {
                Button(
                    shape = RoundedCornerShape(16.dp),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(54.dp)
                        .fillMaxWidth()
                ) {
                    Text(text = "Get Started")
                }
                Spacer(modifier = Modifier.height(12.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .height(1.dp)
                            .weight(1f)
                            .background(Color(0xFFDCDCE4))
                    )
                    Text(text = "OR", modifier = Modifier.padding(horizontal = 12.dp))
                    Box(
                        modifier = Modifier
                            .height(1.dp)
                            .weight(1f)
                            .background(Color(0xFFDCDCE4))
                    )
                }
                Spacer(modifier = Modifier.height(12.dp))
                OutlinedButton(
                    shape = RoundedCornerShape(16.dp),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(54.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo_facebook),
                        contentDescription = "Facebook"
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Continue with Facebook")
                }
                Spacer(modifier = Modifier.height(12.dp))
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(54.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo_google),
                        contentDescription = "Facebook"
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Continue with Google")
                }
            }
        }
        TextButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp)

        ) {
            Text(text = "Sign up later")
        }
    }
}