package InputFromUser

import java.util.Scanner

fun main(args:Array<String>){
//this is java syntax
    var sc = Scanner(System.`in`)
    println("Enter the Number")
    var num = sc.nextInt()
    println(num)
    //in kaotlin
    var num1 = readLine()
    println(num1)
}