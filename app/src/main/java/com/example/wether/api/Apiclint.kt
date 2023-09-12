package com.example.wether.api


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Apiclint {

    companion object{
        var base_url="https://api.open-meteo.com/v1/"


        lateinit var retrofit: Retrofit

        fun getapi(): Retrofit {

            retrofit=Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit

        }

    }

}