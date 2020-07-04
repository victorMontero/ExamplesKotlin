package arrays

fun main(){

    val ages: IntArray = intArrayOf(25, 19, 33, 20, 55, 75)

    var higherAge = Int.MIN_VALUE // determina valor ABAIXO do valor da variavel

    // EXEMPLO FOR
    for(age in ages){
        if(age > higherAge){
            higherAge = age
        }
    }

    println(higherAge)


    //EXEMPLO FOREACH (função que recebe função como parâmetro)
    var lowerAge = Int.MAX_VALUE // determina valor ACIMA do valor da variavel
    ages.forEach { age ->
        if(age < lowerAge){
            lowerAge = age
        }
    }
    println(lowerAge)

}