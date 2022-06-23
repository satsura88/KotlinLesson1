package com.example.kotlinlesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var field1 = 5
        val field2 = 5

        //field2 = 45
        field1 = 21

        val test1 = Test(1,2)
        val test2 = Test(1,2)

        //val newI = test1.getValI()
        val newI2 = test1.valI
        test1.varI = newI2
        //test1.valI = newI2
        //test1.serVarI(newI)


    }
}

class Test constructor(val valI: Int, var varI: Int ){}
