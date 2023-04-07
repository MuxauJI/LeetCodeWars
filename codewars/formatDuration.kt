fun formatDuration(seconds : Int): String {
    var d = seconds
    var years = 0
    var day = 0
    var hour = 0
    var min = 0
    var sec = 0
    val ar = mutableListOf<String>()
    if(d == 0) return "now"
    while(d>0) {
        if (d / 31536000 > 0) { d -= 31536000; years += 1; continue }
        if (d / 86400 > 0) { d -= 86400; day += 1; continue }
        if (d / 3600 > 0) { d -= 3600; hour += 1; continue }
        if (d / 60 > 0) { d -= 60; min += 1; continue }
        else { sec+=d; d-=d; }
    }
    if(years>1) ar.add("$years years") else if(years == 1) ar.add("$years year")
    if(day>1) ar.add("$day days") else if(day == 1) ar.add("$day day")
    if(hour>1) ar.add("$hour hours") else if(hour == 1) ar.add("$hour hour")
    if(min>1) ar.add("$min minutes") else if(min == 1) ar.add("$min minute")
    if(sec>1) ar.add("$sec seconds") else if(sec == 1) ar.add("$sec second")
    return when(ar.size) {
        1 -> ar.joinToString()
        2 -> ar.joinToString(" and ")
        else -> ar.dropLast(1).joinToString(", ") + " and " + ar.takeLast(1).joinToString()
    }
}


// short
/* fun formatDuration(seconds: Int): String {
        if (seconds == 0) return "now"
        return listOf(
            "year" to seconds / 31536000,
            "day" to (seconds / 86400) % 365,
            "hour" to (seconds / 3600) % 24,
            "minute" to (seconds / 60) % 60,
            "second" to seconds % 60
        )
        .filter { it.second > 0 }
        .map { if (it.second > 1) "${it.first}s" to it.second else it }
        .run { foldIndexed("") { index, result, value ->
            val delimeter = when {
                index < size - 2 -> ", "
                index < size - 1 -> " and "
                else -> ""
            }
            "$result${value.second} ${value.first}$delimeter"
        }}
    }
 */



fun main() {
    formatDuration(1234).also(::println)
}