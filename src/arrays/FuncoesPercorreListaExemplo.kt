package arrays

fun main(){

    val idades:IntArray = intArrayOf(10, 15, 35, 25, 30, 45, 75)

    val maiorIdade = idades.max()
    println("a maior idade da lista é: $maiorIdade anos")

    val menorIdade = idades.min()
    println("a maior idade da lista é: $menorIdade anos")

    val mediaIdade: Double = idades.average()
    println("a média de idades da lista é $mediaIdade")

    val saoMaioresDeIdade = idades.all { it >= 18 }
    println("são todos maiores? $saoMaioresDeIdade")

    val existeMaiorIdade = idades.any { it > 18 }
    println("existe algum aluno maior de idade? $existeMaiorIdade")

    val listaMaioresDeIdade = idades.filter { it >= 18 }
    println("alunos maiores de idade: $listaMaioresDeIdade")

    val buscaPrimeiraIdadeMaior = idades.find { it >= 18 }
    println("a primeira idade maior ou igual 18 é: $buscaPrimeiraIdadeMaior")


}