package com.wm.bitco.ui


import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wm.bitco.R
import com.wm.bitco.domain.models.UserLoginForm
import com.wm.bitco.domain.models.UserRegForm
import com.wm.bitco.ui.theme.*

var loginfield = mutableListOf<Unit>()
@Composable
@Preview
fun LoginForm(){
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    Column  (

        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        backgroundGradient_Begin,
                        backgroundGradient_End
                    )
                )
            )
    ,horizontalAlignment = Alignment.CenterHorizontally

    ){
            Spacer(modifier = Modifier.padding(20.dp))

            Image(modifier = Modifier,imageVector = ImageVector.vectorResource(id = R.drawable.logo), contentDescription = "logo")
            Spacer(modifier = Modifier.padding(16.dp))
            Text(text = "Login",fontFamily = InerFamily, fontWeight = FontWeight.Bold, color = DarkPurple,fontSize = 22.sp)
            Spacer(modifier = Modifier.padding(6.dp))

       OutlinedTextField(
            value = email,

            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.email_icon),
                    contentDescription = "Email Field", tint = IconsTint)
            },
            onValueChange = {
                email = it

            },
            shape = CircleShape.copy(CornerSize(8)),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = backgroundTextField,
                unfocusedIndicatorColor = backgroundTextField),

            textStyle = TextStyle(
                fontFamily = InerFamily,
                fontWeight = FontWeight.ExtraLight,
                color = Color.White,fontSize = 13.sp),

            label = { Text(
                text = "Email",
                fontFamily = InerFamily,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 13.sp) },

            placeholder = { Text(
                text = "Enter your email...",
                fontFamily = InerFamily,
                fontWeight = FontWeight.ExtraLight,
                color = Color.White,fontSize = 13.sp) },
        )

        Spacer(modifier = Modifier.padding(8.dp))

        OutlinedTextField(
            value = password,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.key_icon),
                    contentDescription = "Password Field", tint = IconsTint)
            },
            onValueChange = {
                password = it

            },
            shape = CircleShape.copy(CornerSize(8)),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = backgroundTextField,
                unfocusedIndicatorColor = backgroundTextField),

            textStyle = TextStyle(
                fontFamily = InerFamily,
                fontWeight = FontWeight.ExtraLight,
                color = Color.White,fontSize = 13.sp),

            label = { Text(
                text = "Password",
                fontFamily = InerFamily,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 13.sp) },

            placeholder = { Text(
                text = "Enter your password...",
                fontFamily = InerFamily,
                fontWeight = FontWeight.ExtraLight,
                color = Color.White,fontSize = 13.sp) },
                visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = {
                         val form = UserLoginForm(email = email.text, password = password.text)




        },
            Modifier
                .width(290.dp)
                .height(56.dp),
            shape = CircleShape.copy(CornerSize(16)),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = DarkPurple
            )

        ){
            Text(text = "Get Started",fontFamily = InerFamily, fontWeight = FontWeight.Bold, color = Color.White,fontSize = 16.sp)
        }
        Spacer(modifier = Modifier.padding(100.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            
        }
        Text(text = "Don't have a account? ", fontFamily = InerFamily, fontWeight = FontWeight.Light, color = Color.White,fontSize = 14.sp)
        ClickableText(text = AnnotatedString("Registration"), onClick = {Log.e("TAG","HEHE")},style=TextStyle(fontFamily = InerFamily, fontWeight = FontWeight.Light, color = Color.Cyan,fontSize = 14.sp))
    }
}
