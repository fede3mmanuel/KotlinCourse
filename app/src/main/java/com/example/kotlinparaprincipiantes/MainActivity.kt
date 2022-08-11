package com.example.kotlinparaprincipiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesYConstantes()
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
}