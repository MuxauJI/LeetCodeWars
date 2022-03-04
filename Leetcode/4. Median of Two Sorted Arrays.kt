package Leetcode

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val nums3 = nums1.plus(nums2).toList().sorted()
    println(nums3.size / 2)

    return 1.0
}

fun main() {
    findMedianSortedArrays(intArrayOf(1,3), intArrayOf(2)).also(::println)
}