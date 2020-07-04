package arrays

fun main(){

    val notas = intArrayOf(7, 5, 8, 9)

    val media = notas.sorted().takeLast(3).average()

    println(media)




}