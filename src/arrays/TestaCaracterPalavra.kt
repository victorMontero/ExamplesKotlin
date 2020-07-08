package arrays

fun main() {

    testaPalavra("banana")

}

// tentar outra abordagem, recebendo string mesmo, comparando (mas aí o melhor jeito é ter indice de array, pra poder comparar mesmo.

fun testaPalavra(palavra: String) {
    val listaPalavra: Array<String> = palavra.toCharArray().map { it.toString() }.toTypedArray()

    listaPalavra.forEachIndexed { i, letra ->
        var verificarLetra = listaPalavra[i]

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

