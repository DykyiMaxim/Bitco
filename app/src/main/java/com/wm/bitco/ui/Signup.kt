package com.wm.bitco.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.Typeface
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.res.ResourcesCompat
import com.wm.bitco.R

@Composable
@Preview
fun SignUpForm(){

    Column  (

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
    ,horizontalAlignment = Alignment.CenterHorizontally

    ){
            Spacer(modifier = Modifier.padding(48.dp))

            Image(modifier = Modifier,imageVector = ImageVector.vectorResource(id = R.drawable.logo), contentDescription = "logo")
            Spacer(modifier = Modifier.padding(16.dp))
            Text(text = "Get Started",style = MaterialTheme.typography.body2.copy(color = Color(0xFF3D1273)))
        }



    }








