package Filter_Map

fun main(args:Array<String>){
    var num = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    var even = num.filter { it%2==0 }
    even.forEach(::println)
    var double = even.map { it*2 }
    double.forEach({ println(it) })
    var result = num.filter { it%2==0 }.map { it*2 }
result.forEach({ println(it) })
}
