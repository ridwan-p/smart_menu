package com.ridwanpa.smartmenu.screens

import android.util.Log
import android.view.KeyEvent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun VerifyCodeScreen(navController: NavController) {
    var code by remember { mutableStateOf("") }
    Column(Modifier.padding(horizontal = 24.dp)) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 72.dp)
                .weight(1f)
        ) {
            Text(
                text = "Verify Code ⚡️",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(14.dp))
            Text(
                text = "We just sent a 4-digit verification code to robert.fox@gmail.com. Enter the code in the box below to continue.",
                color = Color(0xFF8E8EA9),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(40.dp))
            Field(text = code)

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

@Composable
fun Field(
    modifier: Modifier = Modifier,
    text: String
) {

    val length = 4
    var str by remember { mutableStateOf("") }
    var indexFocus by remember { mutableStateOf(0) }
    val focusRequester = remember { (0 until length).map { FocusRequester() } }

    LaunchedEffect(indexFocus) {
        Log.d("codeini indexFocus", indexFocus.toString())
        val i = if (indexFocus <= 0)
            0
        else if (indexFocus >= length)
            (length - 1)
        else
            indexFocus

        focusRequester[i].requestFocus()
    }

    Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
        for (i in 0 until length) {
            val v = if (str.length > i) str[i] else ""
            OutlinedTextField(
                modifier = modifier
                    .requiredWidth(42.dp)
                    .focusRequester(focusRequester[i])
                    .onKeyEvent {
                        if (KeyEvent.KEYCODE_DEL == it.nativeKeyEvent.keyCode && i != 0) {
                            focusRequester[i - 1].requestFocus()
                        }
                        Log.d(
                            "codeini sdaf",
                            it.nativeKeyEvent.number
                                .toChar()
                                .toString()
                        )
                        Log.d("codeini v", v.toString())
                        true
                    },
                singleLine = true,
                value = v.toString(),
                onValueChange = {
                    Log.d("codeini it", it)
                    if (it.isNotEmpty()) {
                        str = str.substring(0, i) + it
                        indexFocus = i + 1
                    } else {
                        str = str.substring(0, str.length - 1)
                        indexFocus = i - 1
                    }
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next
                ),
                keyboardActions = KeyboardActions(
                    onPrevious = {
                        Log.d("codeini dsaf", "onPrevious")
                    },
                    onGo = {
                        Log.d("codeini dsaf", "onGo")
                    },
                    onNext = {
                        Log.d("codeini dsaf", "onNext")
                    },
                )
            )
        }
    }
}
