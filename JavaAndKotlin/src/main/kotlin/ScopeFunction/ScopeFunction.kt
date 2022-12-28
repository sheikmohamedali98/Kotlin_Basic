package ScopeFunction
/**
 * there are two main Different in Scope function
 *
 * 1)the way to referto context object ->Either "This" or "it"
 * 2)the return value ->Context Object  or Lambda results
 *
 *
 *
 * 1)with
 * retuen:lambda results
 * Context Object:This


 *
 * 2)Apply
 * return :lamda function
 * ContextObject: it
 *Mostly avoids let use for NullPointer Exception
 *

 *
 * 3)also
 * return:Context Object,
 * Context Object :it
 *


 *
 *
 * 4)let
 * return :Context Object,
 *
 */
class ScopeFunction {
}
class Person{
    var name:String?= "Sheik Mohamed Ali"
            var age:Int?= 26
}

fun main(){
    val person = Person()

//    println("${person.name}")
//    println("${person.age}")

    val bio:String = with(person){
        println(name)
        println(age)
        age?.plus(5) ?: 0
        "Good mOrning "+name
    }

//    println("Your age i safter 5 year ${ageAfterFiveYear}")
    println(bio)

//===================================================

    val personForApply = Person().apply {
        name = "ali mohamed Sheik"
        age = 24
    }

    with(personForApply){
        println(name)
        println(age)
    }

    //+++++++++++++++++++++++++++++++++++++++++++++
    val numberList:MutableList<Int> = mutableListOf<Int>(1,2,3)
//
//    println("The list are $numberList")
//    numberList.add(4)
//    println("The after adding list are $numberList")
//    numberList.remove(2)
//    println("The list after Remove  are $numberList")
  val dublicateList =  numberList.also {
        println("The list are $it")
    it.add(4)
    println("The after adding list are $it")
    it.remove(2)
    println("The list after Remove  are $it")
    }
//  two object pointing Same reference

    println(numberList)
    println(dublicateList)

    personForApply.also {
       it.name = "new Name Sheik"
        println(it.name)
    }

}