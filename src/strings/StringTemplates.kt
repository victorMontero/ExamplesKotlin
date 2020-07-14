package strings

fun main (){
    var numA = 3
    val sentOne = "são paulo tem $numA libertadores"

    numA = 6
    val sentTwo = "${sentOne.replace("libertadores", "brasileiros")}"

//    println(sentOne)
//    println(sentTwo)

    var nick = "tri"
    println("$nick.length is ${nick.length}")

    println("$nick é quem tem ${nick.length} libertadores")

    val price = """
${'$'}9.99
"""

    println(price)


    println("${'$'} 0.99" ) //template para imprimir cifrão



}
