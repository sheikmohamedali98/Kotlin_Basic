package Array2d

class Array{

    fun arrayPrint(){
        var array2d = Array(3){IntArray(3){1} }

        // var read = readLine()!!.toInt()
        for(row in 0 until 3){
            for(col in 0 until 3){
                array2d[row][col] = readLine()!!.toInt()
            }
        }
        for(row in 0 until 3) {
            for (col in 0 until 3) {
                print("${array2d[row][col]}  ")
            }
            println()
        }
    }


}
fun main(){
    var array:Array = Array()
    array.arrayPrint()
}