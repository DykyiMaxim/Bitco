package com.wm.bitco.domain.repository

import com.plcoding.stockmarketapp.util.Resource
import com.wm.bitco.data.remote.RegFormDTO
import com.wm.bitco.domain.models.UserRegForm

interface BitcoRepository {
    suspend fun register_user(email:String,name:String,password:String):Resource<RegFormDTO>
}