package one.digitalinnovation.collections

fun main(){
    val values = intArrayOf(1,3,7,4,21,6)

    values.forEach {
        println(it)
    }

    println("-----")
    values.sort()
    values.forEach {
        println(it)
    }
}