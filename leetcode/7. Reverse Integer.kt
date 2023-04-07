package leetcode

fun reverseInt(x: Int): Int {
    var subzero = false
    var y=x
    var ans: Long = 0
    if(x<0) { subzero=true; y=-x}
    while(y>0) {
        ans = ans * 10 + y % 10
        y /= 10
    }
    if (ans > Integer.MAX_VALUE) {
        return 0
    }
    return (if(subzero) -ans else ans).toInt()
}

fun main() {
    reverseInt(153469).also(::println)
}