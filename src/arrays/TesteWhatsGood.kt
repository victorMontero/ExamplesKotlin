package arrays

fun main() {


    fun testaPalavra(palavra: String) {
        val listaPalavra: Array<String> = palavra.toCharArray().map { it.toString() }.toTypedArray()
        for (letra in listaPalavra) {
            if (listaPalavra.contains(letra)) {
                println(true)
            }
        }

    }
}

