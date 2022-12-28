package PracticWeek4

class Rectangle(val height:Int,val width:Int) {
    lateinit var inisiate:String
    val isSquare:Boolean
        get(){
            return  height == width
        }

fun initialize(){
    println(this::inisiate.isInitialized)
    inisiate = "sheik"
    println(this::inisiate.isInitialized)
}
}
val fool1 = run{
    println("Calculating")
    42
}

val fool2 :Int
        get(){
            print("Calculating foo2")
          return 42;
        }
fun main(){
    val rectangle = Rectangle(10,20)
    println(rectangle.isSquare)
    print("fool1")
//    println("$fool1")
    println("$fool2")
    rectangle.initialize()
}