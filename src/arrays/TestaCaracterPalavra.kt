package arrays

fun main() {

    //testaCaracterRepetido("salompas")
    testaPalavra("banana")

}

// tentar outra abordagem, recebendo string mesmo, comparando (mas aí o melhor jeito é ter indice de array, pra poder comparar mesmo.

fun testaPalavra(palavra: String) {
    val listaPalavra: Array<String> = palavra.toCharArray().map { it.toString() }.toTypedArray()




    listaPalavra.forEachIndexed { i, letra ->

        val verificarLetra = listaPalavra[0]

        if(listaPalavra.contains(verificarLetra)){
            println(true)
        } else {
            println(false)
        }
    }


//    for (letra in listaPalavra) {
//        if (listaPalavra.contains(letra)) {
//            println(true)
//        } else {
//            println(false)
//        }
//    }

}

fun testaCaracterRepetido (palavra: String){
    val primeiraLetra = palavra.subSequence(0,1)
    //println(primeiraLetra)

    val restoNome = palavra.subSequence(1,palavra.length)
    //println(restoNome)

    if (restoNome.contains(primeiraLetra)){
        println(true)
    } else {
        println(false)
    }
}


