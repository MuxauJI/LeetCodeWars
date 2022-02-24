package Codewars

fun main() {
    val f:(Int,Int) -> Int = { x,y-> if(x>y) y else x}
    f(3*2,7).also(::println)

    val a:(Int,Int)->Int=fun(x:Int,y:Int) = if(x<=y) x else y
    a(3*2,7).also(::println)
}