package Loops



import java.math.BigInteger

fun main(args:Array<String>){
    var num = BigInteger("70000")

    println( factorial(num, BigInteger.ONE))
}
tailrec private fun factorial(num:BigInteger,result:BigInteger):BigInteger {
    if (num==BigInteger.ZERO)
        return result
    else

        return factorial(num- BigInteger.ONE,num*result)
}