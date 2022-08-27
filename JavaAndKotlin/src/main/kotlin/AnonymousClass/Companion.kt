package AnonymousClass

class A {
    companion object {
        @JvmStatic
    fun show() {
        println("Hello Sheik")
    }
}
}
fun main(args:Array<String>){
A.show()
}