package com.wm.bitco.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.Typeface
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.toLowerCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import com.wm.bitco.R
import com.wm.bitco.ui.theme.*

@Composable
@Preview
fun SignUpForm(){

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
            Spacer(modifier = Modifier.padding(48.dp))

            Image(modifier = Modifier,imageVector = ImageVector.vectorResource(id = R.drawable.logo), contentDescription = "logo")
            Spacer(modifier = Modifier.padding(20.dp))
            Text(text = "Get Started",fontFamily = InerFamily, fontWeight = FontWeight.Bold, color = DarkPurple,fontSize = 22.sp)
            Spacer(modifier = Modifier.padding(12.dp))
            Text(text = "Let's create your account", fontFamily = InerFamily, fontWeight = FontWeight.Light, color = Color.White,fontSize = 14.sp)
            Spacer(modifier = Modifier.padding(24.dp))

            TextFieldWithIcons(R.drawable.profileicon,"Name")




        }
        }




@Composable
fun TextFieldWithIcons(draw:Int,str:String) {
    var text by remember { mutableStateOf(TextFieldValue("")) }

    return OutlinedTextField(
        value = text,

        leadingIcon = {
            Icon(
                painter = painterResource(id = draw),
                contentDescription = "null", tint = IconsTint)
                      },
        onValueChange = {
            text = it
        },

       shape = CircleShape.copy(CornerSize(8)),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = backgroundTextField,
            unfocusedIndicatorColor = backgroundTextField),

        label = { Text(
            text = str,
            fontFamily = InerFamily,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 13.sp) },

        placeholder = { Text(
            text = "Enter your ${str.toLowerCase()}",
            fontFamily = InerFamily,
            fontWeight = FontWeight.ExtraLight,
            color = Color.White,fontSize = 13.sp) },
    )
}








