package AnonymousClass
interface  Human{
    fun think()
}
fun main(args:Array<String>){
var programer :Human = object : Human//Anonymous
               {
    override fun think() {
println("Think Virtually hai")
    }

                 }
    programer.think()
}