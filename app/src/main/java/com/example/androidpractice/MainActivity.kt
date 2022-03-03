package com.example.androidpractice

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

        var allCalcsValues = ArrayList<Int>();
        var allCalcsStrings = ArrayList<String>();

        val number1 = findViewById<EditText>(R.id.num1ET)
        val number2 = findViewById<EditText>(R.id.num2ET)

        val addBtn = findViewById<Button>(R.id.addBtn)
        val subBtn = findViewById<Button>(R.id.subBtn)
        val mulBtn = findViewById<Button>(R.id.mulBtn)
        val divBtn = findViewById<Button>(R.id.divBtn)
        val tableBtn = findViewById<Button>(R.id.tableBtn)
        val modeBtn = findViewById<Button>(R.id.modBtn);

        val resultTv = findViewById<TextView>(R.id.resultTV);
        val listTv = findViewById<TextView>(R.id.allCalcsTV);



        addBtn.setOnClickListener {

            if(number1.text.isNotEmpty() && number2.text.isNotEmpty()) {

                val cal = number1.text.toString().toInt() + number2.text.toString().toInt()
                resultTv.setText(cal.toString())
                allCalcsValues.add(cal)
                allCalcsStrings.add(number1.text.toString() + " + " + number2.text.toString() + " = ")
                var listString = "";
                for (i in 0..allCalcsStrings.size) {

                    listString = listString + "\n" + allCalcsStrings.get(i) + allCalcsValues.get(i);

                }
                listTv.setText(listString);
            } else {
                Toast.makeText(applicationContext,"Please Enter both the numbers to complete the calculation",Toast.LENGTH_SHORT).show()
            }

        }
        subBtn.setOnClickListener {

            if(number1.text.isNotEmpty() && number2.text.isNotEmpty()) {

                val cal = number1.text.toString().toInt() - number2.text.toString().toInt()
                resultTv.setText(cal.toString())
                allCalcsValues.add(cal)
                allCalcsStrings.add(number1.text.toString() + " - " + number2.text.toString() + " = ")
                var listString = "";
                for (i in 0..allCalcsStrings.size) {

                    listString = listString + "\n" + allCalcsStrings.get(i) + allCalcsValues.get(i);

                }
                listTv.setText(listString);
            } else {
                Toast.makeText(applicationContext,"Please Enter both the numbers to complete the calculation",Toast.LENGTH_SHORT).show()
            }
        }
        mulBtn.setOnClickListener {

            if(number1.text.isNotEmpty() && number2.text.isNotEmpty()) {

                val cal = number1.text.toString().toInt() * number2.text.toString().toInt()
                resultTv.setText(cal.toString())
                allCalcsValues.add(cal)
                allCalcsStrings.add(number1.text.toString() + " * " + number2.text.toString() + " = ")
                var listString = "";
                for (i in 0..allCalcsStrings.size) {

                    listString = listString + "\n" + allCalcsStrings.get(i) + allCalcsValues.get(i);

                }
                listTv.setText(listString);
            } else {
                Toast.makeText(applicationContext,"Please Enter both the numbers to complete the calculation",Toast.LENGTH_SHORT).show()
            }
        }
        divBtn.setOnClickListener {

            if(number1.text.isNotEmpty() && number2.text.isNotEmpty()) {

                val cal = number1.text.toString().toInt() / number2.text.toString().toInt()
                resultTv.setText(cal.toString())
                allCalcsValues.add(cal)
                allCalcsStrings.add(number1.text.toString() + " / " + number2.text.toString() + " = ")
                var listString = "";
                var i = 0;
                do {

                    listString = listString + "\n" + allCalcsStrings.get(i) + allCalcsValues.get(i);
                    i++

                } while (allCalcsStrings.size > i)
                listTv.setText(listString)
            } else {
                Toast.makeText(applicationContext,"Please Enter both the numbers to complete the calculation",Toast.LENGTH_SHORT).show()
            }
        }

        modeBtn.setOnClickListener {

            if(number1.text.isNotEmpty() && number2.text.isNotEmpty()) {

                val cal = number1.text.toString().toInt() % number2.text.toString().toInt()
                resultTv.setText(cal.toString())
                allCalcsValues.add(cal)
                allCalcsStrings.add(number1.text.toString() + " % " + number2.text.toString() + " = ")
                var listString = "";
                var i = 0;
                do {

                    listString = listString + "\n" + allCalcsStrings.get(i) + allCalcsValues.get(i);
                    i++

                } while (allCalcsStrings.size > i)
                listTv.setText(listString);
            } else {
                Toast.makeText(applicationContext,"Please Enter both the numbers to complete the calculation",Toast.LENGTH_SHORT).show()
            }

        }

        tableBtn.setOnClickListener {
            val num: Int;
            var table: String = "";
            if(number1.text.toString().isNotEmpty()) {
                num = number1.text.toString().toInt()
                for(i in 1..10) {
                    table = table + "\n"+num+" x "+i+" = "+(num*i)
                }
                resultTv.setText(table)
            }
            if(number2.text.toString().isNotEmpty()) {
                val num2 = number2.text.toString().toInt()
                table = table + "\n\n"
                for(i in 1..10) {
                    table = table + "\n"+num2+" x "+i+" = "+(num2*i)
                }
                resultTv.setText(table)
            }

        }


    }
}