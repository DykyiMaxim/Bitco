package com.wm.bitco.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.wm.bitco.R

@Composable
fun SignUpForm(){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF0FA8B2),
                        Color(0xFF6E21D1)
                    )
                )
            )
    ){
        Image(modifier = Modifier.align(Alignment.Center),imageVector = ImageVector.vectorResource(id = R.drawable.logo), contentDescription = "logo")


    }




}



