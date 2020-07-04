package arrays

fun main (){

    // verifica se tem S na serie
    val serie: IntRange = 1.rangeTo(10)
    for(s in serie){
        print(" $s")
    }

    println()


    val numerosPares = 2..100 step 2
    for (numeroPar in numerosPares){
    print(" $numeroPar")
    }

    println()

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("$it ")}

    println()

    //IF recebendo range como parâmetro

    val intervalosalarios = 1500..5000
    val salario = 10000
    if(salario in intervalosalarios){
        println("está dentro do intervalo")
    } else{
        println("não está dentro do intervalo")
    }

    // a letra está dentro do intervalo?
    val alfabeto = "a".."z"
    val letra = "k"
    println(letra in alfabeto)


}