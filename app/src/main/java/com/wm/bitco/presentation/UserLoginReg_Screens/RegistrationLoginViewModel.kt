package com.wm.bitco.presentation.UserLoginReg_Screens
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
            repository
                .register_user(form.email,form.name, form.password)

            //Todo: Make normal check for request

        }

    }
}