package arrays

fun main(){

    val ageOne = 25
    val ageTwo = 19
    val ageThree = 33
    val ageFour = 48

    val higherAge = if (ageOne > ageTwo && ageOne > ageThree && ageOne > ageFour) {
        ageOne
    } else if (ageTwo > ageThree && ageTwo > ageFour) {
        ageTwo
    } else if (ageThree > ageFour) {
        ageThree
    }else{
        ageFour
    }
        println(higherAge)


}