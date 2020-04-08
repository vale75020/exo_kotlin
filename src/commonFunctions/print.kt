package commonFunctions

import constants.*

fun printSomething(message: String){
    println(message)
}

fun guessTheType(anyObject: Any) {
    when (anyObject) {
        is String -> println("$string")
        is Int -> println("$int")
        is Boolean -> println("$boolean")
        is List<*> -> println("$list")
        is Array<*> -> println("$array")
    }
}