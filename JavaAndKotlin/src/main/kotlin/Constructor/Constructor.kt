package Constructor

class Constructor(var n:String) {
    var age:Int = 0;
    var name:String = n;

    constructor(name:String,age:Int):this(name){
        this.age = age;
    }
    fun display(){
        println("I am $name my age is $age ")
    }

}
fun main (args:Array<String>){
    var obj = Constructor("sheik",20)
 obj.display()
}