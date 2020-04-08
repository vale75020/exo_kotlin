package User2

import java.lang.IllegalStateException

class User2(val email: String?, val password: String?)
val user2 = User2("", "azerty")

private fun fail(message: String): Nothing = throw IllegalStateException(message)

val user2Email = user2.email ?: fail("email required")
val user2Password = user2.password ?: fail("password required")

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