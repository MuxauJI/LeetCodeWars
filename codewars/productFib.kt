fun fibonacci(prod:Long):LongArray  {

    /*
    fun productFib(prod: Long): LongArray {
        val (first, second) = generateSequence(Pair(0.toLong(), 1.toLong()), { Pair(it.second, it.first + it.second) }).filter { it.first * it.second >= prod }.first()
        return if (first * second == prod) longArrayOf(first, second, 1) else longArrayOf(first, second, 0)
    }

    fun productFib(prod:Long) =
  generateSequence(1L to 1L) { it.second to it.first + it.second }
    .dropWhile { it.first * it.second < prod }
    .first()
    .let { (l, r) ->
      longArrayOf(l, r, if (l * r == prod) 1 else 0)
    }
     */
    var a = longArrayOf()
    run outForeach@{
        generateSequence(Pair(0, 1), { Pair(it.second, it.first+it.second)}).forEach {
            val (x,y) = it
            if ((x*y).toLong() == prod) { a = longArrayOf(x.toLong(), y.toLong(),1); return@outForeach } else
            if ((x*y).toLong() > prod) { a = longArrayOf(x.toLong(), y.toLong(),0); return@outForeach }
        }
    }
    return a
}

class Fibonacci {
    private val cache: MutableMap<Int, Long> = HashMap()

    fun cal(n: Int): Long {
        if (n == 0) return 0
        if (n == 1) return 1

        return when {
            cache.containsKey(n) -> cache[n]!!
            else -> {
                cache[n] = cal(n - 1) + cal(n - 2)
                cache[n]!!
            }
        }
    }
}

fun fib(prod: Long): LongArray {
    var (a,b) = longArrayOf(0,1)
    while(a*b<prod) {
        a=b.also{b=a}
        b+=a
    }
    return longArrayOf(a,b, if(a*b == prod) 1 else 0)
}

fun main() {
    //println(fibonacci(256319508074468182850).toList()) // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
    //println(Fibonacci().cal(10).toString())
    println(fib(4895).toList().toString())
}