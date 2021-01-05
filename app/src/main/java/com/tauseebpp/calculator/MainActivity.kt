package com.tauseebpp.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buNumberevent(view: View) {
        if (isNewOp) {
            etshownumber.setText(" ")
        }
        isNewOp = false

        val buselect = view as Button
        var buClickvalue: String = etshownumber.text.toString()
        when (buselect.id) {

            bu1.id -> {
                buClickvalue += "1"
            }
            bu2.id -> {
                buClickvalue += "2"
            }
            bu3.id -> {
                buClickvalue += "3"
            }
            bu4.id -> {
                buClickvalue += "4"
            }
            bu5.id -> {
                buClickvalue += "5"
            }
            bu6.id -> {
                buClickvalue += "6"
            }
            bu7.id -> {
                buClickvalue += "7"
            }
            bu8.id -> {
                buClickvalue += "8"
            }
            bu9.id -> {
                buClickvalue += "9"
            }
            bu0.id -> {
                buClickvalue += "0"
            }
            budot.id -> {
                buClickvalue += "."
            }
            buminus.id -> {
                buClickvalue = "-" + buClickvalue
            }
        }
        etshownumber.setText(buClickvalue)
    }

    var op = "*"
    var oldNumber = ""
    var isNewOp = true
    fun buOpevent(view: View) {

        val buselect = view as Button
        when (buselect.id) {
            bumul.id -> {
                op = "*"
            }
            budiv.id -> {
                op = "/"
            }
            busub.id -> {
                op = "-"
            }
            buplus.id -> {
                op = "+"
            }
        }
        oldNumber = etshownumber.text.toString()
        isNewOp = true
    }

    fun buEqualevent(view: View) {
        val newNumber = etshownumber.text.toString()
        var finalNumber: Double? = null
        when (op) {
            "*" -> {
                finalNumber = oldNumber.toDouble() * newNumber.toDouble()
            }
            "/" -> {
                finalNumber = oldNumber.toDouble() / newNumber.toDouble()
            }
            "-" -> {
                finalNumber = oldNumber.toDouble() - newNumber.toDouble()
            }
            "+" -> {
                finalNumber = oldNumber.toDouble() + newNumber.toDouble()
            }
        }
        etshownumber.setText(finalNumber.toString())
        isNewOp=true
    }

    fun buPercent(view: View){
        if(!isNewOp){
        val number1:Double=etshownumber.text.toString().toDouble()/100
        etshownumber.setText(number1.toString())}
        isNewOp=true

    }

    fun buClear(view: View){
        etshownumber.setText(" ")
        isNewOp=true
    }
}