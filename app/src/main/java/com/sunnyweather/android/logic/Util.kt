package com.sunnyweather.android.logic

import android.content.Context
import android.widget.Toast
import com.sunnyweather.android.SunnyWeatherApplication

fun toast(text:String){
    Toast.makeText(SunnyWeatherApplication.context,text,Toast.LENGTH_SHORT).show()
}
fun toast(context: Context, text:String){
    Toast.makeText(context,text,Toast.LENGTH_SHORT).show()
}


object Util {
}