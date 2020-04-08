package colors

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun choseColor(colore: Color) {
    when (colore) {
        Color.RED -> println("rosso")
        Color.GREEN -> println("verde")
        Color.BLUE -> println("blu")
    }
}