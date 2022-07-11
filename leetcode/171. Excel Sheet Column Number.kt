fun titleToNumber(columnTitle: String): Int {
    val l = ('A'..'Z')
    var a : Int = 0
    for(c in columnTitle) {
        a*=26
        a+=l.indexOf(c)+1
    }
    return a
}

fun main() {
    titleToNumber("ZY").also(::println)
}