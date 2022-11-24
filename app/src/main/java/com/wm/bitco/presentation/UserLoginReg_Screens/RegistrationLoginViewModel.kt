package com.wm.bitco.presentation.UserLoginReg_Screens
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wm.bitco.domain.models.UserRegForm
import com.wm.bitco.domain.repository.BitcoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegistrationLoginViewModel @Inject constructor(
    private val repository: BitcoRepository
):ViewModel() {


     fun RegUser(
        form:UserRegForm
    ){
        viewModelScope.launch {
            val res = repository
                .register_user(form.email,form.name, form.password)

            //Todo: Make normal check for request

            Log.d("TAG", res.data.toString())
            Log.d("TAG", res.message.toString())

        }

    }
}