package Exception

fun main(args:Array<String>){
    var str:String = "4a"
    var num:Int = 0;
    try {
        num = str.toInt()
    }catch (e:Exception){
        println(e.printStackTrace())
    }finally{
        println(str);
    }
    num++;
    println(num)

    var num1 :Int = try{
        str.toInt()
    }catch (e:Exception){
        -1
    }
    println(num1)
}