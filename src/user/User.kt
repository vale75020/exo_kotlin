package user
//import extension.printMessage
class User(var name: String, var age: Int, val mail: String) {

    fun makeItMaj(user: User) {
        var message: String = "this is my BIG NAME"
        if (user.name == "jim") {
            println(user.name.toUpperCase())
           // message.printMessage()
        } else {
            message = "not the right name"
            println(message)
        }
    }
}


