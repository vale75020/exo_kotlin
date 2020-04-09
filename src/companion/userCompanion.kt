package companion

class UserCompanion(name: String, age: Int, address: String ){

    companion object{
        fun createNewUser(name: String, age: Int) = UserCompanion(name, age, address = "fzrgfzr")
    }
}