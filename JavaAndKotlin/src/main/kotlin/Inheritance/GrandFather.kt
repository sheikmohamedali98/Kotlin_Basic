package Inheritance
//normaly class and Function are in final we can use "Open" keyword
open class GrandFather {
    open fun propertiesFather(){
        println("Grand Father Proberties")
    }
}
class Father(): GrandFather(){
     fun properties(){
        println(" Father Proberties")

    }

    }

fun main(args:Array<String>){
    var father : GrandFather = Father()
    //father.properties()
    father.propertiesFather()

}