@file:JvmName("Function")
package FuctionExpresion

fun main(args:Array<String>){
    add(4,5)
    println("return type ${addition(10,23)}")
    println("Inline return type ${add_in(10,23)}")

    println("Max  ${max(10,23)}")
    println("Max INline type ${max_in(23,20)}")


println("Claculate ${calCulatAmount(intrest = 0.04,amt=100)}")
    println("Claculate Default ${calCulatAmountDefault(100,0.02)}")
}
//void type
fun add (a:Int,b:Int){
    println("Void type  ${a+b}")
}
//return type
fun addition(a:Int,b:Int):Int{
 return  a+b
}
//inline return type
fun add_in(a:Int,b:Int):Int = a+b

fun max(a:Int,b:Int):Int{
    if(a>b)
        return a
    else
        return b
}
fun max_in(a:Int,b:Int):Int = if(a>b) a else b

fun calCulatAmount(amt:Int,intrest:Double):Int{
    return (amt+(amt*intrest)).toInt()
}
@JvmOverloads
fun calCulatAmountDefault(amt:Int,intrest:Double = 0.04):Int{
    return (amt+(amt*intrest)).toInt()

}