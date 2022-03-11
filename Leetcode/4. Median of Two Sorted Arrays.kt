package Leetcode

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val nums3 = nums1.plus(nums2).toList().sorted()
    val div = nums3.size / 2
    return if (nums3.size % 2 == 0 && div != 0) ((nums3[div - 1].toDouble() + nums3[div].toDouble()) / 2)
    else (nums3[div].toDouble())
}

fun main() {
    findMedianSortedArrays(intArrayOf(), intArrayOf(2,3)).also(::println)
}