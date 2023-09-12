package com.example.wether.Model

import com.google.gson.annotations.SerializedName

data class Wethermodel(

	@field:SerializedName("elevation")
	val elevation: Any? = null,

	@field:SerializedName("hourly_units")
	val hourlyUnits: HourlyUnits? = null,

	@field:SerializedName("generationtime_ms")
	val generationtimeMs: Any? = null,

	@field:SerializedName("timezone_abbreviation")
	val timezoneAbbreviation: String? = null,

	@field:SerializedName("daily_units")
	val dailyUnits: DailyUnits? = null,

	@field:SerializedName("timezone")
	val timezone: String? = null,

	@field:SerializedName("latitude")
	val latitude: Any? = Double,

	@field:SerializedName("daily")
	val daily: Daily? = null,

	@field:SerializedName("utc_offset_seconds")
	val utcOffsetSeconds: Int? = null,

	@field:SerializedName("hourly")
	val hourly: Hourly? = null,

	@field:SerializedName("current_weather")
	val currentWeather: CurrentWeather? = null,

	@field:SerializedName("longitude")
	val longitude: Any? = Double
)

data class Daily(

	@field:SerializedName("sunrise")
	val sunrise: List<String?>? = null,

	@field:SerializedName("weathercode")
	val weathercode: List<Int?>? = null,

	@field:SerializedName("sunset")
	val sunset: List<String?>? = null,

	@field:SerializedName("temperature_2m_max")
	val temperature2mMax: List<Any?>? = null,

	@field:SerializedName("temperature_2m_min")
	val temperature2mMin: List<Any?>? = null,

	@field:SerializedName("time")
	val time: List<String?>? = null
)

data class HourlyUnits(

	@field:SerializedName("temperature_2m")
	val temperature2m: String? = null,

	@field:SerializedName("rain")
	val rain: String? = null,

	@field:SerializedName("visibility")
	val visibility: String? = null,

	@field:SerializedName("snowfall")
	val snowfall: String? = null,

	@field:SerializedName("time")
	val time: String? = null
)

data class Hourly(

	@field:SerializedName("temperature_2m")
	val temperature2m: List<Any?>? = null,

	@field:SerializedName("rain")
	val rain: List<Any?>? = null,

	@field:SerializedName("visibility")
	val visibility: List<Any?>? = null,

	@field:SerializedName("snowfall")
	val snowfall: List<Any?>? = null,

	@field:SerializedName("time")
	val time: List<String?>? = null
)

data class CurrentWeather(

	@field:SerializedName("weathercode")
	val weathercode: Int? = null,

	@field:SerializedName("temperature")
	val temperature: Any? = null,

	@field:SerializedName("windspeed")
	val windspeed: Any? = null,

	@field:SerializedName("is_day")
	val isDay: Int? = null,

	@field:SerializedName("time")
	val time: String? = null,

	@field:SerializedName("winddirection")
	val winddirection: Int? = null
)

data class DailyUnits(

	@field:SerializedName("sunrise")
	val sunrise: String? = null,

	@field:SerializedName("weathercode")
	val weathercode: String? = null,

	@field:SerializedName("sunset")
	val sunset: String? = null,

	@field:SerializedName("temperature_2m_max")
	val temperature2mMax: String? = null,

	@field:SerializedName("temperature_2m_min")
	val temperature2mMin: String? = null,

	@field:SerializedName("time")
	val time: String? = null
)
