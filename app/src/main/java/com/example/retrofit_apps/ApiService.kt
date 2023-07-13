package com.example.retrofit_apps

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET ("character")
    fun getRickandMorty(): Call<ResponseRickandMorty>
}