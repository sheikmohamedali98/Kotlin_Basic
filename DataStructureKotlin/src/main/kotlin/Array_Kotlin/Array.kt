package Array_Kotlin

import kotlin.Array

class Array(size: Int) {
    var array: IntArray = IntArray(size)
    var count: Int = 0;

    fun add(element: Int) {
        if (count == array.size) {
            var newArray: IntArray = intArrayOf(2 * count)
            for (i in 0 until count) {
                newArray[i] = array[i]
            }
            array = newArray
        }
        array[count++] = element
    }

    fun remove(index: Int) {
        if (index < 0 || index >= count) {
            throw IllegalArgumentException("")
        }
        for (i in index until count) {
            array[i] = array[i + 1]
        }
        count--;
    }

    fun set(index:Int,element:Int){
        if(index >=count){
            throw ArrayIndexOutOfBoundsException()
        }
        for(i in 0 until count){

        }
        array[index] = element
    }

    fun print() {
        for (i in 0 until count) {
            print("${array[i]}  ")
        }
    }

}
