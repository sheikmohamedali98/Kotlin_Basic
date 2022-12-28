package Fibanacci

import java.util.*

fun main(){

    var scan = Scanner(System.`in`)
    println("Enter the number")
    var num:Int = scan.nextInt()
    var f: Fibanacci = Fibanacci()
    println("Answer is ")
   println (f.recursion(num))
    println("Answer is")
    f.fibanaccinu(num)
    println()
    println("Enter 3 Digit Number")
    var num1:Int = scan.nextInt()

    println(f.numberCheck(num1))

    println()
    println("Enter the Number")
    var num2:Int = scan.nextInt()
    println(f.frequency(num2))
}