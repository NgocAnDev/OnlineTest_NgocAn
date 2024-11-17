package com.example.currencyconverter.model

class CurrencyModel {
    // handle conversion
    fun convert (amount: Double, rate: Double) : Double{
        return amount*rate
    }
    data class CurrencyRate(
        val base_code: String,
        val conversion_rates: Map<String, Double>

)
    }