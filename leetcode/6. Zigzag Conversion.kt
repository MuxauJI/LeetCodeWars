package leetcode

fun convertzigzag(s: String, numRows: Int): String {
    if (s.isEmpty() || numRows <= 0) return ""
    if (numRows == 1) return s
    val step = 2 * numRows - 2
    val l = s.length
    var ans = ""
    for(i in 0 until numRows) {
        var j=i
        while(j<l) {
            ans+=s[j]
            if (i != 0 && i != numRows - 1 && j + step - 2 * i < l) {
                ans+=s[j + step - 2 * i]
            }
            j += step
        }
    }
    return ans
}

fun main() {
    convertzigzag("PINALSIGYAHRPI", 3).also(::println) // PINALSIGYAHRPI
}

