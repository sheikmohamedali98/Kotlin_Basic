package nullpointer

class NullPonterException {

}

fun main(){
    val a:String = "Sheik"
//    a = null
    var b:  String? = "mohamed"

    val l: Int = if (b != null) b.length else -1
    b = null
    val l1 = b?.length ?: -1

    val listwithNull = listOf<String?>("hello","sheik",null)
    listwithNull.forEach { it?.let{
        println(it)
    } }

    println("hello "+l)
    println(l1)

    println(a.length)
    println(b?.length)
}