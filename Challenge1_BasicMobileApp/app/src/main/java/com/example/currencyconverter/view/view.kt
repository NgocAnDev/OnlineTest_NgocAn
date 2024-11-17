package com.example.currencyconverter.view

import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.example.currencyconverter.MainActivity
import com.example.currencyconverter.R
import java.text.DecimalFormat

class ConverterView(
    private val activity: MainActivity,
    private val currenFrom: Spinner,
    private val currenTo: Spinner,
    private val result: TextView
) {

    // Defines the currency list
    private val currencyList = arrayOf("AED","AFN","AOA","BMD","CUP","CZK","EUR","GBP","GBP","GHS","USD","VND")

    // Set spinner for currency
    fun setupCurrencySpinners() {
        val adapter = ArrayAdapter(activity, android.R.layout.simple_spinner_item, currencyList)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        currenFrom.adapter = adapter
        currenTo.adapter = adapter
    }

    // Display error message
    fun showError(error: String) {
        result.text = error
    }

    fun updateResult(resultText: Double) {
        val decimalFormat = DecimalFormat("#.############")
        val formattedResult = decimalFormat.format(resultText)

        result.text = " $formattedResult"
    }
}
