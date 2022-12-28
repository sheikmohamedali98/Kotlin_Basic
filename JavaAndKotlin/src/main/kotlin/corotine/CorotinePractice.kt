package corotine

import kotlin.concurrent.thread

fun main(){
    println("main pricess  start ${Thread.currentThread().name}")

    thread{
//        for (i in 0 until 10000) {
            println("fake pricess  start ${Thread.currentThread().name}")
        Thread.sleep(1000L)
        println("main pricess  stop ${Thread.currentThread().name}")
//        }
    }

    println("main pricess  stop ${Thread.currentThread().name}")
}