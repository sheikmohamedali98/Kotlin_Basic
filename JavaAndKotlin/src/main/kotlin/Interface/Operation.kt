package Interface

interface Operation {
    fun sum(num1: Int, num2: Int): Int = num1+num2
    fun div(num1: Int, num2: Int): Int = num1/num2
}

class UserOperation : Operation {
    override fun sum(num1: Int, num2: Int): Int {
        return num1 + num2-2
    }

    override fun div(num1: Int, num2: Int): Int {
        return num1 / num2-2
    }

}
class ManagerOperation:Operation{

}
fun main(){
    val managerOperation = ManagerOperation()
   println(managerOperation.div(100,10))
    val  userOperation =UserOperation()
    println(userOperation.div(100,10))
}