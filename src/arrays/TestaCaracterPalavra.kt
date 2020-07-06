package arrays

fun main() {

    testaPalavra("banana")

}

fun testaPalavra(palavra: String) {
    val listaPalavra: Array<String> = palavra.toCharArray().map { it.toString() }.toTypedArray()
    val verificarLetra = listaPalavra[0]

    listaPalavra.forEachIndexed { i, letra ->
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

