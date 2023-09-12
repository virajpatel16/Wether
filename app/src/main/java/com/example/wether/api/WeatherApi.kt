package com.example.wether.api

import com.example.wether.Model.Wethermodel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("forecast")
    fun getWeatherData(
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double,
        @Query("hourly") hourly: String,
        @Query("temperature2mMax") temperature2mMax:String,
        @Query("temperature2mMin") temperature2mMin:String,
        @Query("weathercode") weathercode:String,
        @Query("daily") daily: String,
        @Query("current_weather") currentWeather: Boolean,
        @Query("timezone") timezone: String,
        @Query("start_date") startDate: String,
        @Query("end_date") endDate: String
    ): Call <List<Wethermodel>>
}