package Constructor

class ConstructorExample constructor(var n:String = "mohamed ")
{
    var name:String = n
            fun show(){
                println("Good Morning $name")
            }
}
fun main(args:Array<String>){
    var obj = ConstructorExample("Sheik")

    obj.show()
    var obj1 = ConstructorExample()
    obj1.show()

}