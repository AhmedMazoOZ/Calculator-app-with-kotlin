package com.ahmedazooz.calculator_with_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var isnewop = true
    fun bunumevent(view: View) {
        if (isnewop) {
            tvResult.text = ""
        }
        isnewop = false
        var tvmessage = tvResult.text.toString()
        var buttonselect = view as Button

        when (buttonselect.id) {
            bu0.id -> {
                tvmessage += "0"
            }
            bu1.id -> {
                tvmessage += "1"
            }
            bu2.id -> {
                tvmessage += "2"
            }
            bu3.id -> {
                tvmessage += "3"
            }
            bu4.id -> {
                tvmessage += "4"
            }
            bu5.id -> {
                tvmessage += "5"
            }
            bu6.id -> {
                tvmessage += "6"
            }
            bu7.id -> {
                tvmessage += "7"
            }
            bu8.id -> {
                tvmessage += "8"
            }
            bu9.id -> {
                tvmessage += "9"
            }
            budot.id -> {
                tvmessage += "."
            }
            bu.id -> {
                tvmessage = "-" + tvmessage
            }


        }
        tvResult.setText(tvmessage)
    }

    var oldnum = ""
    var op = "+"
    fun opEvent(view: View) {
        oldnum = tvResult.text.toString()
        isnewop=true
        val butselected=view as Button
        when(butselected.id){
            buadd.id->{
                op="+"
            }
            busub.id->{
                op="-"
            }
            budiv.id->{
                op="/"
            }
            bumul.id->{
                op="*"
            }

        }
    }

    fun buequalEvent(view: View){
        val newnumber=tvResult.text.toString()
        var finalnum:Double?=null
        when(op){
            "/"->{
                finalnum=oldnum.toDouble() / newnumber.toDouble()
            }
            "*"->{
                finalnum=oldnum.toDouble() * newnumber.toDouble()
            }
            "+"->{
                finalnum=oldnum.toDouble() + newnumber.toDouble()
            }
            "-"->{
                finalnum=oldnum.toDouble() - newnumber.toDouble()
            }
        }
        tvResult.setText(finalnum.toString())
        isnewop=true
    }
    fun buClear(view: View){
        isnewop=true
        tvResult.text=""
    }
}
