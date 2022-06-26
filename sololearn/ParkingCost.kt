package sololearn
fun main() {
    /*
     * Стоимость парковки: первые 1..5 часов по 1$
     * последющие часы по 0.5$
     * целые сутки - 15$
     */
    val h = 42//readLine()!!.toInt()
    var fifth = 0
    val days = h / 24
    if(days == 0) {
        if (h in 1..5) fifth = h
        else if (h > 5) fifth = 5
    }
    val left = (h - days*24 - fifth)
    println(days*15 + fifth*1 + left*0.5)
}