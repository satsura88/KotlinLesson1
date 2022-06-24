package com.example.kotlinlesson1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log


internal class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val field = 5
        val test = Test()
        val newTest = NewTest("", "")
        test.name()
        Log.d("logs", (newTest as NewTest).newField)   // cast
        Log.d("logs", "${newTest is NewTest}")    // instanceOf

    }
}

//class Test constructor(val valI: Int, var varI: Int ){}
open class Test (){

    protected open val protString = ""

    constructor(field: String):this()
    constructor(field: String, field2: String):this(field)
    constructor(field: String, field2: String, field3: String):this(field,field2)

    private lateinit var valI: String
    //var varI: Int
    fun name(){
        valI = "тест шмест"
        Log.d("logs", valI)
    }
}

class NewTest(field0: String, field2: String):Test(field0,field2){

    public override val protString:String =""

    var newField:String = ""
    get(){
        return "$field get"
    }
    set(value){
        field = "$value set"
    }
    init{
        newField = "newtest"
    }
}

class Button @JvmOverloads constructor(context: Context, attributeSet: AttributeSet?=null, defstyleAttr: Int=0)