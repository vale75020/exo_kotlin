import colors.Color
import colors.choseColor
import constants.*
import topLevel.showTokenAndUrl
import topLevel.topLevel
import user.User
import user.makeItMaj
import java.lang.IllegalStateException

fun main() {
    val user = User(name = "john", age = 18, mail = "jim@gmail.com")
    val colore = Color.BLUE
    guessTheType(true)
    makeItMaj(user)
    choseColor(colore)
    smallerSynt(8, 7)
    smaller(4, 5)
    numberToFind(33)
    numberEnum(Numbers.TWO)
    isUserOld(111)
    println("kotlin wikipedia is available on this url $urlKotlin")
    topLevel("ciao")
    showTokenAndUrl()
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



fun smallerSynt(a: Int, b: Int) = if (a > b) println("the smaller is $b") else println("the smaller is $a")

fun smaller(a: Int, b: Int) {
    var message: String
    return if (a > b) {
        println(message1)
    } else {
        println(message2)
    }
}

enum class Numbers(val num: Int) {
    ONE(1),
    TWO(2),
    THREE(3)
}

fun numberEnum(numero: Numbers) {
    if(numero == Numbers.ONE){
        println(Numbers.ONE)
    } else if(numero == Numbers.TWO) {
        println(Numbers.TWO)
    } else {println(Numbers.THREE)}
}

fun numberToFind(num: Int) {
    when (num) {
        in 1..20 -> println("number $num is between 1-20")
        in 21..40 -> println("number $num is between 21-40")
        in 41..100 -> println("number $num is between 41-100")
    }
}

class User2(val email: String?, val password: String?)
val user2 = User2("", "azerty")


/*private fun fail(message: String): Nothing = throw Exception(message)
*/
private fun fail(message: String): Nothing = throw IllegalStateException(message)

val user2Email = user2.email ?: fail("email required")
val user2Password = user2.password ?: fail("password required")


/*fun isUserOld(age: Int) {
    val response = age > 65
    return println(response)
}*/

fun failOld(message: String): Nothing = throw IllegalStateException(message)

fun isUserOld(age: Int) {
    if(age<0){
        failOld("too young")
    } else if(age>100){
        failOld("too old")
    }else if(age>65 && age<100){
        val response = true
        return println(response)
    } else {
        val response = false
        return println(response)
    }
}


















