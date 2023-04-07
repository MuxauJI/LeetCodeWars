package leetcode
import kotlin.math.*

fun maxArea(height: IntArray): Int {
    var left: Int = 0
    var right: Int = height.size - 1
    var maxarea: Int = 0

    while (left < right) {
        maxarea = max(maxarea, min(height[left], height[right]) * (right - left))
        if(height[left] < height[right]) {
            left++
        } else {
            right--;
        }
    }
    return maxarea;
}

fun main() {
    val height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
    maxArea(height = height).also(::println)
}