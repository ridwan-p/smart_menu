package com.ridwanpa.smartmenu.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun EmailVerification(navController: NavController) {
    var email by remember {
        mutableStateOf("")
    }
    Column(Modifier.padding(horizontal = 24.dp)) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 72.dp)
                .weight(1f)
        ) {
            Text(
                text = "What’s your email? \uD83D\uDCE8",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(14.dp))
            Text(
                text = "We need it to search after your account or create a new one",
                color = Color(0xFF8E8EA9)
            )
            Spacer(modifier = Modifier.height(40.dp))
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                placeholder = { Text(text = "Email") },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    backgroundColor = Color.White,
                    unfocusedBorderColor = Color(0xFFEAEAEF)
                ),
            )
        }

        Button(
            onClick = { },
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .height(54.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Next")
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}