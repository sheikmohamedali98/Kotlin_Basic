package nullpointer

open class Clk{
    open fun copy():Person{
        return Person(-1,"")
    }
}
data class Person(var id:Int, var name:String):Clk(){

    override fun copy(): Person {
        super.copy()
        return Person(id,name+" mohamad")
    }
}

fun main(){
    val sheik = Person(1,"sheik")
    var mani = Person(2,"Mani")
//    println(mani.copy())
    mani = sheik.copy()
    if(sheik==mani){
        println("Equal Operator")
    }
    if(sheik === mani){
        println("equal operator second")
    }
}
