package com.example.kotlinparaprincipiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variablesYConstantes()

        //tiposDeDatos()

        //sentenciaIf()

        //leccionn 4
        //sentenciaWhen()

        //Lección 5
        //arrays()

        //Leccion 6
        //maps()

        //Leccion 7
        //loops()

        //Leccion 8
        //nulSaffety()

        //Leccion 9
        funciones()
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
        val myNumber = 60

        if ((myNumber <= 10 && myNumber > 5) || myNumber == 53) {
            println("$myNumber es menor o igual que que 10 y mayor que 5 o es igual a 53")
        } else if (myNumber == 60){
            println("$myNumber es igual a 60")
        }
        else {
            println("$myNumber es mayor que 10 o menor a 5 y no es igual a 53")
        }

    }

    fun sentenciaWhen() {
        val country = "Mexico"

        when (country) {
            "España", "Mexico", "Peru", "Colombia", "Argentina" -> {
                println("Español")
            }
            "EEUU"-> {
                println("Ingles")
            }
            "Francia"-> {
                println("Frances")
            } else -> {
                println("No conocemos el idioma")
        }
        }

        // When con Int
        val age = 10

        when (age) {
            0, 1, 2 -> {
                println("Eres un bebe")
            } in 3..10 -> {
                println("Eres un niño")
            } in 11..17 -> {
                println("Eres un adolescente")
            } in 18..69 -> {
                println("Eres un adulto")
            } in 70..99 -> {
                println("Eres anciano")
            } else -> {
                println("Edad no valida")
        }
        }
    }
    fun arrays() {

        val name = "Braian"
        val suname = "Moure"
        val company = "MoureDev"
        val age = "32"

        // Creacion de array

        val myArray = arrayListOf<String>()

        //Añadir datos

        myArray.add(name)
        myArray.add(suname)
        myArray.add(company)
        myArray.add(age)
        myArray.add(age)

        println(myArray)

        //Añadir un conjunto de datos
        myArray.addAll(listOf("Hola", "Bienvenidos", "al", "tutorial"))
        println(myArray)

        //Acceso a datos

        val myCompany = myArray[0]
        println(myCompany)

        //Modificacion de datos
        myArray[5] = "Suscribete"
        println(myArray)

        // Eliminar datos

        myArray.removeAt(4)
        println(myArray)

        myArray.forEach {
            println(it)
        }

        //otras operaciones
        myArray.count()

        println(myArray.count())
        myArray.clear()

        println(myArray)
    }

    fun maps() {
        var myMap: Map<String, Int> = mapOf();
        println(myMap);

        myMap = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)
        println(myMap)

        //añadir un solo valor
        myMap["Ana"] = 7
        println(myMap)
        myMap.put("Maria", 8)
        println(myMap)

        myMap.put("Brais", 3)
        println(myMap)

        myMap["Brais"] = 4
        println(myMap)

        myMap.put("Marcos", 3)
        println(myMap)

        //Acceso a dato
        println(myMap["Brais"])

        //Eliminar un dato

        myMap.remove("Brais" )
        println(myMap)
    }

    private fun loops() {
        // bucles
        val myArray = listOf("Hola", "Bienvenido al tutorial", "suscribete")
        val mymap = mutableMapOf("Brasis" to 1, "Pedro" to 2, "Sara" to 5)

        //for

        for (myString in myArray) {
            println(myString)
        }

        for (myElement in mymap) {
            println("${myElement.key}-${myElement.value}")
        }

        for(x in 0..10) {
            println(x)
        }

        for(x in 0 until 10) {
            println(x)
        }

        for(x in 0..10 step 2) {
            println(x)
        }

        for(x in 10 downTo 0 step  3) {
            println(x)
        }

        val myNumericArray = (0..20)

        for (mynum in myNumericArray) {
            println(mynum)
        }

        var x = 0
        while ( x < 10){
            println(x)
            x += 2
        }
    }

    fun nulSaffety() {
        //var myString = "Mourodev"
        //myString = null
        //println(myString)

        //Null safety variable
        //var mySafetyString:String? = "Mourodev null safety"
        //mySafetyString = null
        //println(mySafetyString)

        //mySafetyString = "Suscribete"
        //println(mySafetyString)
        //println(mySafetyString!!)

        /*if (mySafetyString != null) {
            //println(mySafetyString!!)
            //println(mySafetyString!!)
        } else {
            println("null number")
        }*/

        //Safe call
        //println(mySafetyString?.length)

        //mySafetyString?.let {
            // not null do something
            //println(it:);
            //println("not null");
        //}

        //mySafetyString?.let {
         //   println(it)
        //} ?:run {
        //    println(mySafetyString)
        //}

        val a = "Kotlin"
        val b: String? = null
        println(b?.length)
        println(a?.length) // Unnecessary safe call
        b?.let { println(it) }
        if (b != null) {
            println(b)
        } else {
            println("The value is null")
        }
    }


    fun funciones() {
        sayHello()
        sayHello()
        sayHello()

        sayMyName("Brais")
        sayMyName("Pedro")
        sayMyName("Sara")

        sayMyNameAndAge("Brais", 32)

        val sumResult = sumTwoNumbers(10, 5)
        println(sumResult)

        println(sumTwoNumbers(15, 9))

        println(sumTwoNumbers(10, sumTwoNumbers(5, 5)))
    }

    //Funcion simple
    fun sayHello(){
        println("Hola!")
    }

    //Funciones con parametros de entrada
    fun sayMyName(name: String){
        println("Hola My nimbre es $name")
    }

    fun sayMyNameAndAge(name: String, age: Int){
        println("Hola My nimbre es $name y mi edad es $age")
    }

    //Funciones con valor de retorno
    fun sumTwoNumbers(firstNumber:Int, secondNumber:Int) : Int {
        val sum = firstNumber + secondNumber;
        return sum
    }
}