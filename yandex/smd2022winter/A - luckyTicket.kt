package yandex.smd2022winter/*
fun luckyTicket(i: Int): Int {
    fun toListInt(s: String): MutableList<Int> = s.map{it.digitToInt()}.toMutableList()
    fun sumOfInt(a: List<Int>) = a.sum()
    fun twoIntToStr(b: MutableList<Int>, c: MutableList<Int>): Int = (b.joinToString("")+c.joinToString("")).toInt()
    val t = i.toString()
    var fListInt = toListInt(t.take(3))
    var sListInt = toListInt(t.takeLast(3))
    val fSum = sumOfInt(fListInt)
    var sSum = sumOfInt(sListInt)
    while(fSum != sSum) {
        sListInt[2] = sListInt.last()+1
        sSum=sumOfInt(sListInt)
    }
    return twoIntToStr(fListInt, sListInt)
}
*/
/*
fun Leetcode.Yandex.yandex.yandex.smd2022winter.smd2022winter.smd2022winter.yandex.smd2022winter.smd2022winter.smd2022winter.leetcode.main() {
    var t = readLine()!!.toString().filter { it.isDigit() }
    //var t = "165901".filter { it.isDigit() } // 101002
    if(t.length < 6) return

    fun toListInt(s: String): MutableList<Int> = s.map { it.digitToInt() }.toMutableList()
    fun incListByOne(l: MutableList<Int>): MutableList<Int> {
        var s = l.joinToString("")
        s = (s.toInt() + 1).toString()
        if (s.length > 3) { return toListInt("000") }
        if (s.length == 2) return toListInt("0$s")
        if (s.length == 1) return toListInt("00$s")
        return toListInt(s)
    }

    fun sumOfInt(a: List<Int>) = a.sum()
    fun twoIntToStr(b: MutableList<Int>, c: MutableList<Int>): String = (b.joinToString("") + c.joinToString(""))
    /*
    var fListInt = toListInt(t.take(3))
    var sListInt = toListInt(t.takeLast(3))

    val fSum = sumOfInt(fListInt);
    var sSum = sumOfInt(sListInt)*/

    while(sumOfInt(toListInt(t.take(3))) != sumOfInt(toListInt(t.takeLast(3)))) {
        t = (t.toInt()+1).toString()
    }
    println(t)
    /*
    while (fSum != sSum) {
        sListInt = incListByOne(sListInt)
        sSum = sumOfInt(sListInt)
    }*/
    //println(twoIntToStr(fListInt, sListInt))
}*/
/*
fun Leetcode.Yandex.yandex.yandex.smd2022winter.smd2022winter.smd2022winter.yandex.smd2022winter.smd2022winter.smd2022winter.leetcode.main() {
    luckyTicket(165901).also(::println)
}*/


fun main() {
    //var t = readLine()!!.toString().filter { it.isDigit() }
    var t = "100999"
    fun toListInt(s: String): List<Int> = s.map { it.digitToInt() }.toList()
    while((toListInt(t.take(3))).sum() != (toListInt(t.takeLast(3))).sum()) {
        t = (t.toInt()+1).toString()
    }
    println(t)
}