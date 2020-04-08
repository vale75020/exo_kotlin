package numbers

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