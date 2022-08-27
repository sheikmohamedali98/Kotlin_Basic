package AnonymousClass

class B {
    companion object {

    fun creat(): B = B()
}
    fun show(){
        println("Hello ")
    }
}
fun `in`(){
println("BackTick")
}
fun  main(args:Array<String>){
    var obj = B.creat();
    obj.show()
    `in`()
}