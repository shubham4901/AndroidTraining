package com.example.androidpractice

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1 = findViewById<EditText>(R.id.num1ET)
        val number2 = findViewById<EditText>(R.id.num2ET)

        val addBtn = findViewById<Button>(R.id.addBtn)
        val subBtn = findViewById<Button>(R.id.subBtn)
        val mulBtn = findViewById<Button>(R.id.mulBtn)
        val divBtn = findViewById<Button>(R.id.divBtn)
        val tableBtn = findViewById<Button>(R.id.tableBtn)
        val modeBtn = findViewById<Button>(R.id.modBtn);

        val resultTV = findViewById<TextView>(R.id.resultTV);



        addBtn.setOnClickListener {

            resultTV.setText((number1.text.toString().toInt()+number2.text.toString().toInt()).toString())

        }
        subBtn.setOnClickListener {

            resultTV.setText((number1.text.toString().toInt()-number2.text.toString().toInt()).toString())

        }
        mulBtn.setOnClickListener {

            resultTV.setText((number1.text.toString().toInt()*number2.text.toString().toInt()).toString())

        }
        divBtn.setOnClickListener {

            resultTV.setText((number1.text.toString().toInt()/number2.text.toString().toInt()).toString())

        }

        modeBtn.setOnClickListener {

            resultTV.setText((number1.text.toString().toInt()%number2.text.toString().toInt()).toString())

        }

        tableBtn.setOnClickListener {
            val num: Int;
            var table: String = "";
            if(number1.text.toString().isNotEmpty()) {
                num = number1.text.toString().toInt()
                for(i in 1..10) {
                    table = table + "\n"+num+" x "+i+" = "+(num*i)
                }
                resultTV.setText(table)
            }
            if(number2.text.toString().isNotEmpty()) {
                val num2 = number2.text.toString().toInt()
                table = table + "\n\n"
                for(i in 1..10) {
                    table = table + "\n"+num2+" x "+i+" = "+(num2*i)
                }
                resultTV.setText(table)
            }

        }


    }
}