package com.wm.bitco.data.repository

import com.plcoding.stockmarketapp.util.Resource
import com.wm.bitco.data.remote.BitcoApi
import com.wm.bitco.data.remote.RegFormDTO
import com.wm.bitco.domain.models.UserRegForm
import com.wm.bitco.domain.repository.BitcoRepository
import java.lang.Exception
import javax.inject.Inject

class BitcoRepositoryImpl @Inject constructor(
    private val BitcoApi:BitcoApi

) :BitcoRepository {
    override suspend fun register_user(email:String,name:String,password:String): Resource<RegFormDTO> {
        val reg = UserRegForm(
            email = email,
            name = name,
            password = password
        )
        return try {
            Resource.Success(
               data = BitcoApi.register_user(user = reg),
            )

        }catch (e: Exception){
            e.printStackTrace()
            Resource.Error(e.message?:"An uncnown error")
        }
    }



    }
