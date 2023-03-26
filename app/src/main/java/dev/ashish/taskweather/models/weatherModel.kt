package dev.ashish.taskweather.models

data class WeatherModel(
    val base: String,
    val clouds: Clouds,
    val cod: Int,
    val coordinate: coordinate,
    val dt: Int,
    val id: Int,
    val main: Main,
    val name: String,
    val rain: Rain,
    val sys: Sys,
    val timezone: Int,
    val visibility: Int,
    val weather: List<Weather>,
    val wind: Wind
)