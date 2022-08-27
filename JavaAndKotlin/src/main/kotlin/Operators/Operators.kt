package Operators

fun main(args:Array<String>){
   var num1:Int = 10;
   var num2:Int = 8;
    var result:Int = num1+num2
   println("the addition of $num1 and $num2 is $result")
    println("subraction number ${num1-num2}")

    var obj = Demo()
    obj.name = "sheik"
    println("my name is : ${obj.name}")

    if(num1>num2)
        result = num1
    else
        result = num2

    println("Result is $result")
//Expresion
  result =   if(num1>num2)
         num1
    else
         num2

    println(" Expression Result is $result")

    println("String Cpmparision**********************")
    //String Comparision
    var name1:String = "Sheik";
    var name2:String = "sheik";
    if(name1.equals(name2,ignoreCase = true))
        println("Same");
    else
        println("Not same")
println("Equal operator")
    if(name1 ==name2)
        println("Same");
    else
        println("Not same")

    //null Pointer Exception

    var str:String? = null
    var obj1 = Demo();

    println("Null pointer :${obj1.name1?.length}")
//null for object
    var obj2 :Demo? =Demo();
    obj2 = null
    println("Object null :${obj2?.name1}")
}