fun duplicateCount(str: String): Int {
    return str.toLowerCase().toList().groupingBy { it }.eachCount().filter { it.value > 1}.count()
}

// same
// fun duplicateCount(text: String) = text.groupBy(Char::toLowerCase).count { it.value.count() > 1 }
/* fun duplicateCount(text: String): Int {
    return text.groupingBy { it.toLowerCase() }.eachCount().values.count { it > 1 }
}*/


fun main() {
    val text = "dA" + "c".repeat(10) + "b".repeat(100) + "a".repeat(1000)
    duplicateCount(text).also(::println)
}