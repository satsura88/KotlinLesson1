package com.example.kotlinlesson1

import android.content.Context
import android.graphics.Color.green
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.appcompat.widget.AppCompatButton


internal class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<AppCompatButton>(R.id.btn).setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {

            }
        })

        val dataClass = NoteKotlin("title", "note", R.color.black)

        val alex = object {
            val name = "Alex"
            var age = 20
        }
        alex.age = 34
        //View.OnClickListener
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
object SingleNewTest{
    val protString:String = ""
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

    companion object Name{
        const val staticField = "статика"
    }
}

class Button @JvmOverloads constructor(context: Context, attributeSet: AttributeSet?=null, defstyleAttr: Int=0)