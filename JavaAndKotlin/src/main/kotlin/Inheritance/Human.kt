package Inheritance

open class Human(age:Int) {
    init{
        println("I Love Human First Consstructor $age")
    }
    open fun think(){
        println("I Love Human")
    }
}
class Male(age:Int) :Human(age){
    init{
        println("I Love Male First Consstructor $age")
    }

    override fun think(){
        println("I Love Male " );
    }
}

fun main(args:Array<String>){
    var male:Human  = Male(20)
    male.think()
}