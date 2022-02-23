fun twoOldestAges(ages: List<Int>): List<Int> {
    var firstOld : Int = 0
    var secondOld : Int = 0
    for(age in ages) {
        if(firstOld < age) {
            secondOld = firstOld
            firstOld = age
        } else if(secondOld < age) {
            secondOld = age
        }
    }
    return listOf(secondOld, firstOld)
}

// solutions with sort
// fun twoOldestAges(ages: List<Int>) = ages.sorted().takeLast(2)

// with mutablelist
/* fun twoOldestAges(ages: List<Int>): List<Int> {
    var list = ArrayList(ages);
    val max1:Int = list.maxOrNull() as Int;
    list.remove(max1)
    val max2:Int = list.maxOrNull() as Int;
    return listOf(max2, max1);
}*/

fun main() {
    twoOldestAges(listOf(1,5,87,45,8,8)).also(::println)
}