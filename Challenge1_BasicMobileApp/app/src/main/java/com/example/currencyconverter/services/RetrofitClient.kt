package com.example.currencyconverter.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
 private const val url = "https://v6.exchangerate-api.com/v6/f105409bd8e934006538b331/"
 fun getClient() : Retrofit{
     return Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build()
 }

}