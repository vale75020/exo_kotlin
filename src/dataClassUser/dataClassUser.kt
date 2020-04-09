package dataClassUser

data class DataUser(
    var email: String,
    var password: String,
    var isConnected: Boolean)

val dataUser1 = DataUser("vale@gmail.com","ciao",true)
val dataUser2 = DataUser("toto@gmail.com","toto",false)

fun printDataUser(){
    println(dataUser1.toString())
}

fun compareDataUser(){
    if(dataUser1 == dataUser2) {
         println("users are equals")
    } else {
        println("users are not equals")
    }
}