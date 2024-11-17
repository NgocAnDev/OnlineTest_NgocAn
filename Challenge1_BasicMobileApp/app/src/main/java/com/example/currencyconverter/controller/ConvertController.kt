package com.example.currencyconverter.controller

import android.util.Log
import com.example.currencyconverter.MainActivity
import com.example.currencyconverter.model.CurrencyModel

import retrofit2.HttpException

class ConverterController(private val activity: MainActivity) {
    private val model = CurrencyModel()

    // Method to handle currency conversion
    suspend fun convertCurrency(amount: Double, from: String, to: String) {
        try {
            // Call API to get smell ratio
            val response = ApiService.api.getExchangeRate(from)
            if (response.isSuccessful) {
                val ratesMap = response.body()
                if (ratesMap != null) {
                    val rate = ratesMap.conversion_rates[to]
                    if (rate != null) {
                        val result = model.convert(amount, rate)
                        Log.d("ConverterController", "Converted Result: $result")
                        activity.updateResult(result)
                    } else {
                        activity.showError("Rate not available for this currency")
                    }
                }
            } else {
                // Print error information when response fails
                Log.e(
                    "ConverterController",
                    "Failed to fetch exchange rates: ${response.code()} - ${response.message()}"
                )
            }
        } catch (e: HttpException) {
            // Log HTTP errors with detailed error codes
            Log.e("ConverterController", "HTTP Error: ${e.message()} - Code: ${e.code()}")
            activity.showError("HTTP error occurred: ${e.message()} - Code: ${e.code()}")
        }
    }
}
