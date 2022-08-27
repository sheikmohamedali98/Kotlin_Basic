package Loops

import java.math.BigInteger

fun main(args:Array<String>){
    var num = BigInteger("70")

println( factorial(num))
}
private fun factorial(num:BigInteger):BigInteger = if (num==BigInteger.ZERO) BigInteger.ONE else num*factorial(num- BigInteger.ONE)