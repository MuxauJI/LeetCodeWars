package codewars

fun abbreviateTwoWordName(str: String) = str.split(" ").map { s -> s.first().uppercaseChar() }.joinToString(".")

fun main() {
    abbreviateTwoWordName("P Favuzzi").also(::println)
}