package com.sunnyweather.android.logic.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//Retrofit构建器 单例类

object ServiceCreator {
    private const val BASE_URL = "https://api.caiyunapp.com/"
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create()) //使用GSON转换库解析JSON数据
        .build()

    fun<T> create(serviceClass:Class<T>):T = retrofit.create(serviceClass)
    inline fun <reified T> create():T = create(T::class.java) //获得传入的泛型对象的对象属性。泛型实体化
}