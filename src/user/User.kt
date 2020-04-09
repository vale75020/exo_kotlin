package user

import extension.printMessage

class User(var name: String, var age: Int, val mail: String) {

    fun makeItMaj() {
        var message: String = "this is my BIG NAME"
        if (this.name == "jim") {
            println(this.name.toUpperCase())
            message.printMessage()
        } else {
            message = "not the right name"
            println(message)
        }
    }
}


