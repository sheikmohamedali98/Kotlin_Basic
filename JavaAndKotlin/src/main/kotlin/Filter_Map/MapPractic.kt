package Filter_Map

class MapPractic {
}
fun main(){
    val map = mutableMapOf<Int,String>((1 to "a"),(2 to "b"),(3 to "c"))
    val list = listOf<Int>(1,2,3,4,5,6,7,8,9)
    val list1 = listOf<Char>('a','b','c')
    val filter = list.filter { it%2 == 0 }
    val any = list.any { it%2 ==0 }
    val find = list.find { it%2 ==0 }
    val zipwithNext = list.zipWithNext { a, b -> a+b }
    val zip = list.zip(list1)
    val flatten = list.flatMap { list1 }
    println(filter)
    println(any)
    println(find)
    println(zipwithNext)
    println(zip)
    println(flatten)
}