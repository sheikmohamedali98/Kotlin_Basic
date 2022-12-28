package JavatoKotlin

import java.util.*


object GreedMethod {
	@JvmStatic
	fun main(args: Array<String>) {
		// TODO Auto-generated method stub
		val grid =
			arrayOf(intArrayOf(3, 0, 8, 4), intArrayOf(2, 4, 5, 7), intArrayOf(9, 2, 6, 3), intArrayOf(0, 3, 1, 0))
		if (grid == null) {
			println(0)
		}
		var i = 0
		var j = 0
		val data1 = 0
		val data2 = 0
		val max = 0
		val arr = IntArray(grid.size)
		val arr2 = IntArray(grid.size)
		while (i < grid.size) {
			j = 0
			while (j < grid.size) {
				arr[i] = Math.max(arr[i], grid[i][j])
				arr2[j] = Math.max(arr2[j], grid[i][j])
				println("arr1  " + Arrays.toString(arr))
				println()
				j++
			}
			println("arr2  " + Arrays.toString(arr2))
			i++
		}
		var ans = 0
		for (k in grid.indices) {
			for (l in grid.indices) {
				ans += Math.min(arr[k], arr2[l] - grid[k][l])
			}
		}
		println(ans)
	}
}