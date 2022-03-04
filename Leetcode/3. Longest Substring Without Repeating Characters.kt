package Leetcode
/*
    Метод скользящего окна
    Используя предидущий результат, добавляем в конец новый элемент и удаляем первый сначала.
 */
fun lengthOfLongestSubstring(s: String): Int {
    var left = 0
    var right = 0
    var max = 0
    val charsSet: MutableSet<Char> = HashSet()
    while(right < s.length) {
        if(charsSet.add(s[right])) {
            right++
            max = maxOf(max, charsSet.size)
        } else {
            charsSet.remove(s[left])
            left++
        }
    }
    return max
}

fun main() {
    lengthOfLongestSubstring("abcabcbb").also(::println)
}