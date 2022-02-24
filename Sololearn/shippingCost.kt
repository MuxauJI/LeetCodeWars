package Sololearn

fun shippingCost(amount: Double, international: Boolean): Double {
    val compare:(Double,Double)-> Double = {
        x,y -> if(x<=y) x else y
    }
    return when {
        international -> compare(amount*0.15, 50.0)
        amount < 75.0 -> amount*0.1
        else -> 0.0
    }
}

fun main() {
    shippingCost(199.8, true).also(::println)
}