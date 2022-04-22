package com.ridwanpa.smartmenu.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ridwanpa.smartmenu.R
import com.ridwanpa.smartmenu.Routes

@Composable
fun OnBoardingScreen(navController: NavController) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.on_boarding),
            contentDescription = "illustration",
            modifier = Modifier
                .height(432.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            Modifier
                .height(6.dp)
                .width(120.dp)
                .clip(RoundedCornerShape(50))
                .background(Color(0xffEAEAEF))
        ) {
            Box(
                modifier = Modifier
                    .height(6.dp)
                    .width(30.dp)
                    .clip(RoundedCornerShape(50))
                    .background(Color(0xFFFFB01D))
            )
        }
        Spacer(modifier = Modifier.height(32.dp))
        Column(Modifier.padding(horizontal = 24.dp)) {
            Text(text = "Full contactless experience", fontSize = 26.sp, color = Color(0xFF32324D))
            Spacer(modifier = Modifier.height(14.dp))
            Text(text = "From ordering to paying, that’s all contactless", fontSize = 16.sp, color = Color(0xFF8E8EA9))
        }
        Spacer(modifier = Modifier.height(32.dp))
        Column(Modifier.padding(horizontal = 24.dp)) {
            TextButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth()
                    .height(54.dp)

            ) {
                Text(text = "Sign up later")
            }
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = { navController.navigate(Routes.AuthenticationScreen.name) },
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth()
                    .height(54.dp)
            ) {
                Text(text = "Get Started")
            }

        }

    }
}