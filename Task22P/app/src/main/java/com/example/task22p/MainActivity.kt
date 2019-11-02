package com.example.task22p

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var result: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        convertButton.setOnClickListener{

            // convert & add totals;
            var total =  convertInch(inchTxt.text.toString().toDouble()) + convertMile(milesTxt.text.toString().toDouble()) + convertFeet(feetTxt.text.toString().toDouble())

            // conditionally convert to meters & concatinate appropate measurement notation.
            if (meterCheckbox.isChecked) result = convertMetres(total).toString() + "m"  else result = total.toString() + "cm"

            if (savedInstanceState != null) {
                result = savedInstanceState.getString("result")
            }
            resultView.text = result
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString("result", result)
    }

    fun convertInch(num: Double): Double {
        return num * 2.54
    }

    fun convertFeet(num: Double): Double {
        return num * 30.48
    }

    fun convertMile(num: Double): Double {
        return num * 160934.4
    }

    fun convertMetres(num: Double): Double {
        return num / 100
    }











}
