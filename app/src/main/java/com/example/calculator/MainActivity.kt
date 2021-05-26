package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etNumber1 = findViewById<EditText>(R.id.etNumber1)
        var etNumber2 = findViewById<EditText>(R.id.etNumber2)
        var btnAdd = findViewById<Button>(R.id.btnAdd)
        var btnSubtract = findViewById<Button>(R.id.btnSubtract)
        var btnMultiply = findViewById<Button>(R.id.btnMultiply)
        var btnModulus = findViewById<Button>(R.id.btnModulus)
        var tvResult = findViewById<TextView>(R.id.tvResult)

        btnAdd.setOnClickListener {
            if(etNumber1.text.toString() == ""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else if(etNumber2.text.toString() == ""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else {
                var number1 = etNumber1.text.toString().toInt()
                var number2 = etNumber2.text.toString().toInt()
                var result = number1 + number2
                tvResult.text = "${result}"
            }
        }
        btnSubtract.setOnClickListener {
            if(etNumber1.text.toString() == ""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else if(etNumber2.text.toString() == ""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else {
                var number1 = etNumber1.text.toString().toInt()
                var number2 = etNumber2.text.toString().toInt()
                var result = number1 - number2
                tvResult.text = "${result}"
            }
        }
        btnMultiply.setOnClickListener {
            if(etNumber1.text.toString() == ""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else if(etNumber2.text.toString() == ""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else {
                var number1 = etNumber1.text.toString().toInt()
                var number2 = etNumber2.text.toString().toInt()
                var result = number1 * number2
                tvResult.text = "${result}"
            }
        }
        btnModulus.setOnClickListener {
            if(etNumber1.text.toString() == ""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else if(etNumber2.text.toString() == ""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else {
                var number1 = etNumber1.text.toString().toInt()
                var number2 = etNumber2.text.toString().toInt()
                var result = number1 % number2
                tvResult.text = "${result}"
            }
        }
    }
}
