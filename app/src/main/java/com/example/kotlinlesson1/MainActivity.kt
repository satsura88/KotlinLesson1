package com.example.kotlinlesson1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var field1 = 5
        val field2 = 5


        field1 = 21

        val test1 = Test()
        test1.name()


    }
}

//class Test constructor(val valI: Int, var varI: Int ){}
class Test constructor(){
    private lateinit var valI: String
    //var varI: Int
    fun name(){
        valI = "тест шмест"
        Log.d("logs", valI)
    }
}

class Button @JvmOverloads constructor(context: Context, attributeSet: AttributeSet?=null, defstyleAttr: Int=0)