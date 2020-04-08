package numbers

import constants.message1
import constants.message2

fun smallerSynt(a: Int, b: Int) = if (a > b) println("the smaller is $b") else println("the smaller is $a")

fun smaller(a: Int, b: Int) {
    return if (a > b) {
        println(message1)
    } else {
        println(message2)
    }
}



fun numberToFind(num: Int) {
    when (num) {
        in 1..20 -> println("number $num is between 1-20")
        in 21..40 -> println("number $num is between 21-40")
        in 41..100 -> println("number $num is between 41-100")
    }
}