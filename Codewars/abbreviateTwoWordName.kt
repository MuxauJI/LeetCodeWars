package Codewars

fun abbreviateTwoWordName(str: String) = str.split(" ").map { s -> s.first().toUpperCase() }.joinToString(".")

fun main() {
    abbreviateTwoWordName("P Favuzzi").also(::println)
}