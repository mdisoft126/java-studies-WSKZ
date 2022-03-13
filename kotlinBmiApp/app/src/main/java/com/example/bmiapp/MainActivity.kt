package com.example.bmiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        val heightTxt = findViewById<EditText>(R.id.txtHeight)
        val weightTxt = findViewById<EditText>(R.id.txtWeight)
        val bmiInfo = findViewById<TextView>(R.id.txtBmiInfo)
        val classif = findViewById<TextView>(R.id.txtClassif)

        btn.setOnClickListener{
            val heightStr:String = heightTxt.text.toString()
            val weightStr:String = weightTxt.text.toString()
            val height:Double = java.lang.Double.valueOf(heightStr)/100
            val weight:Double = java.lang.Double.valueOf(weightStr)

            val bmi:Double = weight/(height*height)
            bmiInfo.text = "$bmi"
            classif.text = "${bmiClassification(bmi)}"
        }
    }

   fun bmiClassification(bmi:Double):String {

        var resp = ""

        if (bmi < 16) {
            resp = "Starvation"
        } else if (bmi >= 16 && bmi < 17) {
            resp = "Emaciacion"
        } else if (bmi >= 17 && bmi < 18.5) {
            resp = "Underweight"
        } else if (bmi >= 18.5 && bmi < 25) {
            resp = "Correct weight"
        } else if (bmi >= 25 && bmi < 30) {
            resp = "Overweight"
        } else if (bmi >= 30 && bmi < 35) {
            resp = "1st degree of obesity"
        } else if (bmi >= 35 && bmi < 40) {
            resp = "2nd degree of obesity"
        } else {
            resp = "3rd degree of obesity"
        }

        return resp
    }
}