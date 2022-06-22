package com.example.kotlinlesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var field1 = 5
        val field2 = 5

        field2 = 45
        field1 = 21
    }
}

class Test constructor(val i: Int, var ){

}