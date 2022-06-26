fun getMiddle(s:String):String {
    val len = s.length
    if (s.length <= 2) return s
    return if (len % 2 ==0) s[(len/2)-1] + s[len/2].toString()
    else s[(len/2)].toString()
}
// short 
/* fun getMiddle(word : String) : String {
   return word.substring((word.length - 1) / 2, word.length / 2 + 1)
} */

fun main() {
    getMiddle("testing").also(::println)
    //println(7/2)
}