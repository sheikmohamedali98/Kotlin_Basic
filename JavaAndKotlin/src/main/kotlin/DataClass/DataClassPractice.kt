package DataClass

class DataClassPractice {
}
data class User(var age:Int,var name:String){
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}
fun main(){


    val man1 = User(23,"sheik")
    val man2 = man1.copy(name = "mohamed")
    val man3 = man1.copy()

    val hash1=man1.hashCode();
    val hash2=man2.hashCode();
    val hash3=man3.hashCode();

    println(man1 == man3)
    println(man1.hashCode())
    println(man2.hashCode())
    println(man3.hashCode())


    //checking equality of  these hash codes
    println("hash1 == hash 2 ${hash1.equals(hash2)}")
    println("hash2 == hash 3 ${hash2.equals(hash3)}")
    println("hash1 == hash 3 ${hash1.equals(hash3)}")
}

fun main(args: Array<String>)
{
    //declaring a data class
    data class man(val name: String, val age: Int)
    {
        //property declared in class body
        var height: Int = 0;
    }

    val man1 = man("manish",18)

    //copying details of man1 with change in name of man
    val man2 = man1.copy(name="rahul")

    //copying all details of man1 to man3
    val man3 = man1.copy();

    //declaring heights of individual men
    man1.height=100
    man2.height=90
//    man3.height=110

    //man1 & man3 have different class body values,
    //but same parameter values

    //printing info all 3 men
    println(man1 === man3)
    println("${man1} has ${man1.height} cm height")
    println("${man2} has ${man2.height} cm height")
    println("${man3} has ${man3.height} cm height")

}
