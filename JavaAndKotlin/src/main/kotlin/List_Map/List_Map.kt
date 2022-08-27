package List_Map

import java.util.TreeMap

fun main(args:Array<String>){

    var nums = listOf(1,2,3,4,5)
//list
    for((i,e) in nums.withIndex()){
        println(" $i : $e")
    }

    println()
    var map = TreeMap<String,Int>()
     map["sheik"] = 23;
    map["mohamed"] = 24;
    for((i,e) in map){
        println("  $i  :  $e ")
    }
}