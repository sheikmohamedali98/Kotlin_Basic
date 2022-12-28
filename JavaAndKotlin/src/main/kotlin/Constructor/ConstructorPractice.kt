package Constructor

open class ConstructorPractice() {
    var model:String? = null
    var price:Double? = null
    constructor(model: String, price: Double) : this() {
        this.model = model
        this.price = price
        println(model)
        println(price)
    }
    constructor(owner:String):this(){
        println(model)
        println(price)
        println(owner)
    }
}

fun main() {
        object :ConstructorPractice("maruti",20000.0){
            val constructorPractice = ConstructorPractice(owner = "sheik")

        }



}