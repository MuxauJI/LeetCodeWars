package leetcode

fun runningSum(nums: IntArray): IntArray {
    val res = mutableListOf<Int>()
    var sum = 0
    nums.forEach {
        sum += it
        res.add(sum)
    }
    return res.toIntArray()
}

fun main() {
    runningSum(intArrayOf(1,2,3,4)).also(::println)
}
