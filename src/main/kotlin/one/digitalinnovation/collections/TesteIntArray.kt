package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 3
    values[3] = 6
    values[4] = 9

    println("--------------------------------")
    for (valor in values){
        println(valor)
    }

    println("--------------------------------")
    values.forEach { valor ->
        println(valor)
    }
}