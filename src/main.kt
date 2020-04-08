import User2.isUserOld
import colors.Color
import colors.choseColor
import commonFunctions.guessTheType
import constants.*
import numbers.*
import topLevel.showTokenAndUrl
import topLevel.topLevel
import user.User


fun main() {
    val user = User(name = "john", age = 18, mail = "jim@gmail.com")
    val colore = Color.BLUE
    guessTheType(true)
    user.makeItMaj(user)
    choseColor(colore)
    smallerSynt(8, 7)
    smaller(4, 5)
    numberToFind(33)
    numberEnum(Numbers.TWO)
    isUserOld(67)
    println("kotlin wikipedia is available on this url $urlKotlin")
    topLevel(null)
    showTokenAndUrl()
}






















