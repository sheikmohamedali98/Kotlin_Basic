package Collection


fun main(){
    val number = listOf(0,3,4,5,6,7,8,9,2,5,5)
    println("list :${number}")
    println("sorted :${number.sorted()}")
    val setOfNumber = number.toSet()
    println("set ${setOfNumber}")
    val set1 = setOf(1,2,3)
    val mutableSet = setOf(3,2,1)
    println("compare set and mutable set  ${set1==mutableSet}")
    println("contains : ${setOfNumber.contains(7)}")

    //map
    val map = mutableMapOf<String,Int>("sheik" to 23,"hari" to 34)
    map.put("paul" ,33)
    println("map ${map}")
    println(" map value : ${map["paul"]}")

    map.forEach{println("  ${it.key}  ${it.value}")}
}

