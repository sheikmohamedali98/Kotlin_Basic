package delecate

interface Base1 {
    fun printLine()
    fun print(){
        println("hello")
    }
}

class BaseImpl1(val x: Int) : Base1 {
    override fun printLine() {
        println(x)
    }

    override fun print() {
        println("hai")
    }


}

class Derived1(b1:Base1):Base1 by b1{
    override fun printLine() {
        println("Hello Sheik ")
    }
}

fun main(){
    val b1 = BaseImpl1(20)
    b1.print()
    Derived1(b1).printLine()
    Derived1(b1).print()
}