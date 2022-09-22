package com.example.kotlinparaprincipiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variablesYConstantes()

        //tiposDeDatos()

        sentenciaIf()
    }
    /*
    Aqui vamos ha hablar de constantes y variables
    */
    private fun variablesYConstantes() {
        // Variables

        var myFirstVariable = "Hello Hackerman"
        var myFirstNumber = 1

        println(myFirstVariable)

        myFirstVariable = "Bienvenidos"

        println(myFirstVariable)

        //myFirstVariable = 1

        var mySecondVariable = "Suscribete"

        println(mySecondVariable)

        mySecondVariable = myFirstVariable

        println(mySecondVariable)

        myFirstVariable = "Ya te has suscrito"

        println(myFirstVariable)

        //Constante

        val myFirstConstant = "Te ha gustado el tutorial?"
        println(myFirstConstant)

        //myFirstConstant = "Si te ha gustado dale like"

        val mySecondConstant = myFirstVariable

        println(mySecondConstant)
    }

    private fun tiposDeDatos() {
        // String

        val myString: String = "Hola hackerman"
        val myString2 = "Bienvenido"

        val myString3:String = myString + " " + myString2
        println(myString3)

        //Enteros (byte, short, Int, Long)

        val myInt: Int = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        //Decimales(Float, Double)

        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1
        val myDouble4 = myDouble +myDouble2 + myDouble3 + myFloat
        println(myDouble4)

        //Boolean(bool)

        val myBool: Boolean = true
        var myBool2 = false
        //var mybool3 = mybool + mybool2
        println(myBool ==  myBool2)
        println(myBool && myBool2)


    }

    private fun sentenciaIf() {
        val myNumber = 11

        if (myNumber <= 10) {
            println("$myNumber es menor o igual que que 10")
        } else {
            println("$myNumber es mayor que 10")
        }

    }
}