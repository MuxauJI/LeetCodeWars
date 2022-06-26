package leetcode

fun isSubsequence(s: String, t: String): Boolean {
    if (s.isEmpty()) return true
    var si = 0
    var ti = 0
    while (si < s.length && ti < t.length) {
        if (s[si] == t[ti]) {
            si++
        }
        ti++

        if (si == s.length) return true
    }
    return false
}

fun main() {
    println(isSubsequence("abc","ahbgdc"))
}