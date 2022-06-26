package leetcode

fun isIsomorphic(s: String, t: String): Boolean {
    return isIsomorphicHelper(s, t) && isIsomorphicHelper(t, s)
}

private fun isIsomorphicHelper(s: String, t: String): Boolean {
    val n = s.length
    val map = HashMap<Char, Char>()
    for (i in 0 until n) {
        val c1 = s[i]
        val c2 = t[i]
        if (map.containsKey(c1)) {
            if (map[c1] != c2) {
                return false
            }
        } else {
            map[c1] = c2
        }
    }
    return true
}
fun main() {
    isIsomorphic("badc", "baba").also(::println)
}