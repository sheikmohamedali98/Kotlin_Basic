package enumclass

enum class CoffeeSize(val quatity:Int){
    MEGA(500){
        override fun getInfo(): String {
            return "your order-size is ${this.name}  and Quantity $quatity"
        }
    },
    LARGE(250){
        override fun getInfo(): String {
            return "your order-size is ${this.name}  and Quantity $quatity"
        }
              },
    MEDIUM(150){
        override fun getInfo(): String {
            return "your order-size is ${this.name}  and Quantity $quatity"
        }
               },
    SAMLL(100){
        override fun getInfo(): String {
            return "your order size is ${this.name}  and Quantity $quatity"
        }
    };
    abstract fun  getInfo():String;
}

class Order(var size: CoffeeSize)
/*

in when condition we Don't need else case in enum
 */
fun main(){
    val order = Order(CoffeeSize.LARGE)
    println(order.size.getInfo())
   println( CoffeeSize.MEDIUM.getInfo())
}