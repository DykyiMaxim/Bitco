package com.wm.bitco.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.wm.bitco.R

// Set of Material typography styles to start with
val InerFamily =  FontFamily(
    Font(R.font.inter_black, FontWeight.Normal),
    Font(R.font.inter_bold,FontWeight.Bold),
    Font(R.font.inter_extra_light, FontWeight.ExtraLight),
    Font(R.font.inter_light,FontWeight.Light),
    Font(R.font.inter_medium,FontWeight.Medium),
    Font(R.font.inter_regular,FontWeight.SemiBold),
)

val Typography = Typography(
     body1= TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2= TextStyle(
        fontFamily = InerFamily,
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        fontSize = 22.sp

    )


    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)