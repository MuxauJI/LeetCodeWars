fun decodeRomans(s:String):Int {
    var d: Int = 0
    val romanDigits = mapOf<Char, Int>(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
    )
    val s = s.replace("CM", "DCCCC").replace("IV","IIII").replace("XC", "LXXXX")
            .replace("IX", "VIIII").replace("XL", "XXXX").replace("CD", "CCCC")
    for (c in s) {
        d += romanDigits[c]!!
    }
    return d
}

// shortest
/* fun decode(str: String) = str.map { arrayOf(1,5,10,50,100,500,1000)["IVXLCDM".indexOf(it)] }
    .plus(0).zipWithNext().map { (current, next) -> if (current < next) -current else current }.sum() */
fun main() {
    decodeRomans("MCMXC").also(::println)
    println("MCMXC".map { arrayOf(1,5,10,50,100,500,1000)["IVXLCDM".indexOf(it)] }.plus(0).zipWithNext().map { (a,b) -> if(a<b) -a else a }.sum())
}