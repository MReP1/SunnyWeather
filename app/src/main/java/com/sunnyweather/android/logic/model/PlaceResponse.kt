package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

//数据模型

data class PlaceResponse (
    val status:String,
    val places:List<Place>
        )

data class Place(
    val name:String,
    val location:Location,
    @SerializedName("formatted_address")//让JSON字段和Kotlin字段之间建立映射关系
    val address:String
)

data class Location(
    val lng:String,
    val lat:String
)