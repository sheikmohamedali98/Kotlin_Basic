package sealdclass

import Operators.Demo

sealed class DemoSealed{
    class A :DemoSealed(){
        fun display(){
            println("class a")
        }
    }
    class  B :DemoSealed(){
        fun didplay(){
            println("class B")
        }
    }

}

class  C:DemoSealed(){
    fun display(){
        println("Class C")
    }

}

fun main(){
    val a = DemoSealed.A()
    val b = DemoSealed.B()
    val c = C()
    c.display()
    a.display()
    b.didplay()
}