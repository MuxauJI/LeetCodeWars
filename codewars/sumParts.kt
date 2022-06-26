fun sumParts(ls: IntArray): IntArray {
    val an = mutableListOf<Int>()
    var s = ls.sum()
    for(i in ls) {
        an.add(s)
        s-=i
    }
    an.add(0)
    return an.toIntArray()
}

// cute
/*
fun sumParts(ls: IntArray) = IntArray(ls.size + 1).apply {
    set(0, ls.sum())
    ls.forEachIndexed { index, item -> set(index + 1, get(index) - item) }
}
 */

fun main() {
    sumParts(intArrayOf(0, 1, 3, 6, 10)).joinToString(" ").also(::println)
}