package com.wm.bitco.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wm.bitco.domain.repository.BitcoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
private val repository: BitcoRepository
) :ViewModel() {

    fun regUser(){
        viewModelScope.launch {
            repository.register_user("Gd@gmail.com","Roik","gyujkiugyf7uh")



        }

    }
}