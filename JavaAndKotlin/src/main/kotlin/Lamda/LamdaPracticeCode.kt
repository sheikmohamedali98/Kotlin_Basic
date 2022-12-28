package Lamda


var lamda2 = {a:Int,b:Int->a+b}
var lambda = {println("Hello World") }
fun higherfunc( lmbd: () -> Unit ) {
    lmbd()
}
fun higherFun(lamd: (Int,Int)->Int, pr:(String)->Unit){
    val result = lamd(1,2)
    pr("answer is $result")
}
fun main(args: Array<String>) {
    higherfunc(lambda)
    higherFun(lamda2, ::println)
}