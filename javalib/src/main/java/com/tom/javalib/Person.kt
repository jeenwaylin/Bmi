package com.tom.javalib

fun main(){
    val p = Person()
    p.weight = 65f
    p.height = 1.7f
    println("Your Bmi is ${p.getBmi()}")
}

class Person {
    var weight: Float = 0f
    var height: Float = 0f

    fun sayHello(){
        println("Hello")
    }

    fun getBmi() : Float{
        var bmi = weight / (height*height)
        return bmi
    }

}