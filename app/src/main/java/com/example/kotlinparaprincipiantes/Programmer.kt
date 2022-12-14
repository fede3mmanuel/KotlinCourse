package com.example.kotlinparaprincipiantes

class Programmer(val name: String,var age: Int,val languajes: Array<Languaje>, val friends: Array<Programmer>? = null) {

    enum class Languaje {
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT
    }
    fun code() {
        for (languaje in languajes){
            println("Estoy programando en $languaje")
        }
    }
}