package When

fun main(args:Array<String>){
    val num:Int = 2
    when(num){
        1-> println("one")
        2-> println("two")
        3-> println("three")
        else -> println("Enter the valid number")
    }

    //Expresion
    var str =  when(num){
        1-> "one"
        2-> "two"
        3-> "three"
        else -> "Enter the valid number"
    }
    println("Str is $str")
}