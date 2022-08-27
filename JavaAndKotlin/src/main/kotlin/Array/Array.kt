package Array


 fun main(args:Array<String>){
    var num1 = IntArray(4)


    var nums = intArrayOf(10,20,30)
    nums[0] = 100
    nums.set(1,200)
    print( nums.last())
    for(i in nums){
        print(" "+i)
    }
    println()
    println( nums.get(2))
    println( nums.size)


}