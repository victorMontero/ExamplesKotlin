package arrays

fun main() {

    val salarios: DoubleArray = doubleArrayOf(1500.00, 2500.00, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1

    // for each index cria uma função que recebe função e tem como parâmetro o index e o valor da posição

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())

}
