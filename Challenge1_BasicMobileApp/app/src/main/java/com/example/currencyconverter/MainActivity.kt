package com.example.currencyconverter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.currencyconverter.controller.ConverterController
import com.example.currencyconverter.view.ConverterView
import kotlinx.coroutines.launch
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    private lateinit var amountInput: EditText
    private lateinit var currenFrom: Spinner
    private lateinit var currenTo: Spinner
    private lateinit var btnConverter: Button
    private lateinit var result: TextView
    private lateinit var controller: ConverterController
    private lateinit var converterView: ConverterView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initialize views
        amountInput = findViewById(R.id.etAmountInput)
        currenFrom = findViewById(R.id.spCurrencyFrom)
        currenTo = findViewById(R.id.spCurrencyTo)
        btnConverter = findViewById(R.id.btnConvert)
        result = findViewById(R.id.tvConverted)
        controller = ConverterController(this)
        converterView = ConverterView(this, currenFrom, currenTo, result)
        converterView.setupCurrencySpinners()
        btnConverter.setOnClickListener {
            val amountStr = amountInput.text.toString().trim()
            if (amountStr.isNotEmpty()) {
                val amount = amountStr.toDoubleOrNull()
                if (amount != null) {
                    val decimalPointIndex = amountStr.indexOf(".")
                    if (decimalPointIndex != -1) {
                        // Limit 6 digits after the decimal point
                        if (amountStr.substring(decimalPointIndex + 1).length > 6) {
                            converterView.showError("Too many decimal places")
                        } else {
                            // Proceed with the conversion if the decimal check passes
                            val fromCurrency = currenFrom.selectedItem.toString()
                            val toCurrency = currenTo.selectedItem.toString()
                            lifecycleScope.launch {
                                controller.convertCurrency(amount, fromCurrency, toCurrency)
                            }
                        }
                    } else {
                        val fromCurrency = currenFrom.selectedItem.toString()
                        val toCurrency = currenTo.selectedItem.toString()
                        lifecycleScope.launch {
                            controller.convertCurrency(amount, fromCurrency, toCurrency)
                        }
                    }
                } else {
                    converterView.showError("Invalid amount")
                }
            } else {
                converterView.showError("Amount cannot be empty")
            }
        }
    }

    // This method will be called by the ConverterView to update the result
    fun updateResult(resultText: Double) {
        converterView.updateResult(resultText)
    }

    // This method will be called by the ConverterView to display error messages
    fun showError(error: String) {
        result.text = error
    }
}




