package com.sunnyweather.android.logic.network

import retrofit2.Call
import com.sunnyweather.android.SunnyWeatherApplication
import com.sunnyweather.android.logic.model.PlaceResponse
import retrofit2.http.GET
import retrofit2.http.Query

//retrofit基本用法

interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlace(@Query("query") query:String): Call<PlaceResponse>
    //返回值的泛型定义为PlaceResponse 会被强制转换成这个对象
}