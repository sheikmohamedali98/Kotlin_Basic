package Absract

abstract class Human {
   abstract  fun talk()
     fun think(){
        println("I Love Human")
    }
}
class Male : Human(){
    override fun talk() {
        println("Male talk")
    }


//     fun think(){
//        println("I Love Male " );
//    }
}

class Doctor :Human(){
    override fun talk() {
        println("The Doctor talk")
    }

}

fun main(args:Array<String>){
    var male:Human  = Male()
    male.think()
    male.talk()
    var doctor = Doctor()
    doctor.talk()
}