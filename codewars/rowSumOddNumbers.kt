fun rowSumOddNumbers(n: Int): Int {
    val nLast = (n*(n+1))/2;
    println(nLast)
    val seq = generateSequence(0) { it + 1}
            .filter {it % 2 != 0 }
            .take(nLast)
            .toList()
    println(seq)
    println(seq.size)
    println(seq.sum())
    return ((seq.elementAt(nLast-n) + seq.elementAt(nLast-1))/2)*n
}

// simplest
// fun rowSumOddNumbers(n: Int) = n * n * n

// cute
// fun rowSumOddNumbers(n: Int) = (1..n * (n + 1)).filter { it % 2 != 0 }.takeLast(n).sum()

// too
/* fun rowSumOddNumbers(n: Int): Int {
    val first = n * (n - 1) + 1
    val last = n * n + (n - 1)
    return (first..last step 2).sum()
}
*/
fun main(){
    rowSumOddNumbers(4).also(::println)
}

// same but better
/* fun rowSumOddNumbers(n: Int): Int {
    // drop the previous element of the sequence,
    // fist line has 1 element, second line has two, third has 3...
    // so we need to skip 1 + 2 + ... + n-1
    // using gauss formula
    val nToDrop = n * (n - 1) / 2

    return generateSequence(1) { it + 2 }
        .drop(nToDrop)
        .take(n)
        .sum()
}*/