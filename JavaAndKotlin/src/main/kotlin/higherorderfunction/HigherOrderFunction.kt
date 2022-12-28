package higherorderfunction

class HigherOrderFunction {

    fun additionANdMulti(a:Int,b:Int,actio:(Int)->Int){
        val add = a+b
        println(actio(add))
    }
}
//take function as a parameter and return function
fun main(){
    val sum:(Int)->Int = {it*it}
    val higherOrderFunction = HigherOrderFunction()
    higherOrderFunction.additionANdMulti(10,20,sum)

}
