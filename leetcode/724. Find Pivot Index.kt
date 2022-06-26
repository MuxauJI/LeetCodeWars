package leetcode

fun pivotIndex(nums: IntArray): Int {
    var sum_num = 0
    val sum_all = nums.sum()
    nums.forEachIndexed  { i, el ->
        if(sum_all - el - sum_num == sum_num) {
            return i
        }
        sum_num += el
    }
    return -1
}

fun main() {
    pivotIndex(intArrayOf(1,7,3,6,5,6)).also(::println)
}