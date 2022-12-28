package LazyClass

import JavatoKotlin.Practic

class LazyClass {

    private val practic: Practic by lazy {
        println("Heavy Object initialised")
        Practic()
    }

    fun accessObject() {
        println(practic)
    }

    fun printHello() {
        println("hello")
    }
}

fun main(args: Array<String>) {
    val lazyClass = LazyClass()
    println("SomeClass initialised")
    lazyClass.printHello()
    lazyClass.accessObject()
    lazyClass.accessObject()
}