package com.example.kotlinlesson1

import android.content.Context
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

        val vvodData = 1..100
        val primer = 5
        val WTV = when (primer) {
            in vvodData -> {
                "входит"
            }
            else -> {
                "не входит"
            }
        }

        val dataClass = NoteKotlin("title", "note", R.color.black)
        val dataClassNew = dataClass.copy(color = R.color.white, note = "noteNew", title = "titleNew")

        val alex = object {
            val name = "Alex"
            var age = 20
        }
        alex.age = 34
        //View.OnClickListener
        var result = "congr"
        toStringJava(alex.age)

        val enumEl = WeatherType.CLOUDY
        val today = when (enumEl) {
            WeatherType.SUNNY -> TODO()
            WeatherType.RAINY -> TODO()
            WeatherType.CLOUDY -> {
                "облачно"
            }
            WeatherType.MISTY -> TODO()
            WeatherType.SNOWY -> TODO()
            WeatherType.HAILY -> TODO()
        }

        //циклы
        val daysOfWeek = listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")

        Log.d("logs","-------------")
        daysOfWeek.forEach {
            Log.d("logs","$it")
        }

        Log.d("logs","-------------")
        repeat(daysOfWeek.size) {
            Log.d("logs","${daysOfWeek[it]}")
        }

        Log.d("logs","-------------")
        for(i in daysOfWeek){
            Log.d("logs","$i ")
        }

        Log.d("logs","-------------")
        for(i in daysOfWeek.indices){
            Log.d("logs","${daysOfWeek[i]}")
        }

        Log.d("logs","-------------")
        for(i in 0.. daysOfWeek.size-1){
            Log.d("logs","${daysOfWeek[i]}")
        }
        Log.d("logs","-------------")
        for(i in 0 until daysOfWeek.size){
            Log.d("logs","${daysOfWeek[i]}")
        }

        Log.d("logs","-------------")
        for(i in daysOfWeek.size-1 downTo 0){
            Log.d("logs","${daysOfWeek[i]}")
        }

        Log.d("logs","-------------")
        for(i in daysOfWeek.size-1 until 0 step 1){
            Log.d("logs","${daysOfWeek[i]}")
        }

        var counter = daysOfWeek.size-1
        while (--counter>0){
            Log.d("logs","${daysOfWeek[counter]}")
        }

        counter = daysOfWeek.size-1
        do{
            Log.d("logs","${daysOfWeek[counter]}")
        }while (--counter>0)
    }

    enum class WeatherType {
        SUNNY,
        RAINY,
        CLOUDY,
        MISTY,
        SNOWY,
        HAILY
    }

    fun toStringJava(age:Int): String{ //java подход
        var result = "congr"
        if (age==20){
            result = "nice"
        }else{
            result = "not nice"
        }
        return result
    }
    fun toStringKotlin(age:Int): String{ //kotlin подход
        return if (age==20){
            "nice"
            "nice";
            "nice"
        }else{
            "not nice"
        }
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