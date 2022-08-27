package Interface


interface  A{
    fun show()
    fun abc(){
        println("in Abd A")
    }
}
interface B{
fun display()
    fun abc(){
        println("in Abd B")
    }
}

class C :A,B
{
    override fun show() {
        println("in Show")
    }

    override fun display() {
println("In Display")
    }
    override fun abc(){
        super<B>.abc()
        println("in abc C")
    }

}

fun  main(args:Array<String>){
    var obj = C()
    obj.display()
    obj.show()

    obj.abc()
}