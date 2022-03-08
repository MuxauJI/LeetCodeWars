package Leetcode

fun isPalindrom(s: String): Boolean {
    return s == s.reversed()
}

// Expand Around Center
fun longestPalindrome(s: String): String {
    val l = s.length
    var left = 0
    var right = 0
    var begin = 0
    var curLen = 0
    var maxLen = 1
    for(i in 0 until l) {
        left = i-1
        right = i+1
        while(right<l && s[right] == s[i]) {
            right++
        }

        while(left>=0 && s[left] == s[i]) {
            left--
        }

        while(left>=0 && right<l && s[left] == s[right]) {
            left--
            right++
        }

        curLen = right - left - 1
        if(maxLen < curLen) {
            maxLen = curLen
            begin=left+1

        }
    }

    return s.substring(begin, begin+maxLen)
}

fun main(){
    val s = "abbalabbd"
    longestPalindrome(s).also(::println)
    //isPalindrom(s).also(::println)
}