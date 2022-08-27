package Array

import java.util.function.Consumer

data class human (var name:String, var age :Int)
fun main(args:Array<String>){
    var value:List<human> = listOf<human>(human("sheik",23))
for(i in value){
    println(i.name)
}

    var num = listOf<Int>(1,2,3,4,5,6,7)
//    var con :Consumer<Int> = object:Consumer<Int>{
//        override fun accept(t: Int) {
//            print(t)
//        }
//
//    }
// h igher order function

//    num.forEach({n-> println(n) })
//    num.forEach({println(it) })
    num.forEach(::println)


}