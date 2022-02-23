fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    nums.forEachIndexed { idx, item ->
        val found = map[target - item]
        found?.let {
            return intArrayOf(found, idx)
        }
        map[item] = idx
    }
    throw IllegalArgumentException("No solution")
}
fun main() {
    twoSum(intArrayOf(6,5,7,8,9,3), 10).contentToString().also(::println)
    twoSum(intArrayOf(3,2,95,4,-3), 92).contentToString().also(::println)
    twoSum(intArrayOf(150,24,79,50,88,345,3), 200).contentToString().also(::println)
    twoSum(intArrayOf(-18,12,3,0), -6).contentToString().also(::println)
    twoSum(intArrayOf(-10,-1,-18,-19), -19).contentToString().also(::println)
    twoSum(intArrayOf(-1,-2,-3,-4,-5), -8).contentToString().also(::println)
    twoSum(intArrayOf(2,5,5,11), 10).contentToString().also(::println)
    twoSum(intArrayOf(2,7,11,15), 9).contentToString().also(::println)
    twoSum(intArrayOf(3,2,4), 6).contentToString().also(::println)
    twoSum(intArrayOf(3,3), 6).contentToString().also(::println)
}