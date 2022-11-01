package com.wm.bitco.data.remote

import com.wm.bitco.domain.models.UserRegForm
import retrofit2.http.Body
import retrofit2.http.POST

interface BitcoApi {

    @POST("/v1/users/register")
     suspend  fun register_user(@Body user:UserRegForm):RegFormDTO

}