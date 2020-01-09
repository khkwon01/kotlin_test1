package com.khk

import java.io.InputStreamReader
import java.net.URL
import kotlin.properties.Delegates

val sum = { x:Int, y:Int -> x + y }

class User {

    var nickname = ""
    val httpText by lazy {
        println("lazy init")
        InputStreamReader(URL("http://www.naver.com").openConnection().getInputStream()).readText()
    }

    var name:String by Delegates.observable("") {
        property, oldValue, newValue -> println("기존값 : ${oldValue}, 새로운값 : ${newValue}")
    }

}

class Animal(val map:MutableMap<String, Any?>) {

    var name:String by map
    var age:Int by map

}

data class Fruit(var name:String, var desc:String)

fun String.lastString():String {
    return this.get(this.length - 2).toString()
}