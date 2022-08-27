package DataClass
//Every Class Need A ToString()
//Equal & hashCode
//clone or Copy
data class Laptop (val brand:String,val price:Int){
    fun show(){
        println("I love machine")
    }
}
//data clas is normal class
fun main(args:Array<String>){
    var lap1 = Laptop("DELL",2000)
    var lap2 = Laptop("APPLE",2500)

    var lap3 = lap1.copy()
    println(lap1.equals(lap3))
    println(lap2)
}