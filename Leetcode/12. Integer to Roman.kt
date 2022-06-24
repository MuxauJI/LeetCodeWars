package Leetcode

fun IntTwoRoman(num: Int): String {
    val ans = StringBuilder()
    val digitValues = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
    val romanValues = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
    var N = num
    var count = 0
    while(N>0) {
        while(N>=digitValues[count]) {
            ans.append(romanValues[count])
            N -= digitValues[count]
        }
        count++
    }
    return ans.toString()
}

fun main() {
    IntTwoRoman(1990).also(::println)
}