package com.wm.bitco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.wm.bitco.presentation.MainViewModel
import com.wm.bitco.presentation.UserLoginReg_Screens.RegistrationLoginViewModel
import com.wm.bitco.ui.LoginForm
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel:MainViewModel by viewModels()
    private val RegLoginViewModel: RegistrationLoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            //SignUpForm(RegviewModel)
            LoginForm()


        }


    }
}

