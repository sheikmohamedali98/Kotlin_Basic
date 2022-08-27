package Loops

fun main(args:Array<String>){
    var nums2 = 0 until 10;//last will ot take
    var nums = 0..10;
    //16.downTo(1) is method can we alsowrite like this
    var nums1 = 16 downTo   0
    //For each loop
    // 0 2 4 6 8
    for(a in nums2 step 2){
        print(" $a")
    }
    println();
    //0 2 4 6 8 10
    for(a in nums step 2){
        print(" $a")
    }
    println()
    // 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
    for(a in nums1.reversed() ){
        print(" $a")
    }
    println()
var ch = 'A'..'Z';
    for(c in ch.step(2) ){
        print(" $c")
    }

}