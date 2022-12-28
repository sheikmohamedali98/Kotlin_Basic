

package JavatoKotlin

import java.lang.Exception
import java.lang.StringBuilder


@JvmOverloads
fun sum(num1: Int = 0, num2: Int = 0, num3: Int = 0): String = "Sheik"
fun sheik(num: Int) {

}


enum class COLOR {
    BLUE, ORANGE, RED,GREEN
};

fun getColor(color: COLOR): String = when (color) {
    COLOR.BLUE -> "cold"
    COLOR.ORANGE -> "Mild"
    else -> "Hot"
}

fun respond(string: String) = when (string) {
    "y", "yes" -> print("you say yes")
    "n", "no" -> print("you say No")

    else -> println("I cannot understand")
}

fun colorMix(c1: COLOR, c2: COLOR) = when (setOf(c1, c2)) {
    setOf(COLOR.RED, COLOR.ORANGE) -> print("color red and orange")
    setOf(COLOR.RED, COLOR.BLUE) -> print("color red and Blue")
    else->throw Exception("DirtyColor")

}

fun updateWhether(degree:Int){
    val (desc:String,color:COLOR) = when{
        degree<5-> "cold" to COLOR.BLUE
        degree<25->"mild" to COLOR.ORANGE

        else -> "hot" to COLOR.RED
    }
    println("$desc $color")
}
fun map(){
    val map = mapOf<Int,String>(1 to "one",2 to "two",3 to "Three")


    for((key,value ) in map){
        println("$key   $value")
    }
}
fun list(){
val list = listOf<Int>(1,2,3)
    if(1 in list){
        println("Hai sheik one is there")
    }
for((index,value) in list.withIndex()){
println("$index : $value")
}
    list.forEach { print("$it ,") }
}

fun forloop(){
    for(ch in "abcc"){
        println(ch)
    }
    for(c in '0'..'9'){
        print(c)
    }
    for(i in 0..10 step 2){
        print("$i ")
    }
    for(i in 10  downTo  0 ){
        print("$i ")
    }
}
fun whenCondition(ch:Char):String = when(ch){
    in '0'..'9' -> "is Digit"
    in 'a'..'z'-> "is lower case"
    in 'A' .. 'Z'-> "is Upper case"
    else->"it is Character"
}
fun stringRange(){
    println("ball" in "a".."k")
    println("zoo" in "a" .. "d")
    var ch : Char = "abc".lastChar();
    println(ch)
}
fun String.lastChar() = get(length-1)
var ch : Char = "abc".lastChar();

fun String.repeat(n:Int) :String{
    val sb = StringBuilder(n*length)
    for(i in 1..n){
        sb.append(this);
    }
    return  sb.toString()
}
