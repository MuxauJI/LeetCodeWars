package Leetcode
/*
 * 2. Add Two Numbers
 * https://leetcode.com/problems/add-two-numbers/
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
/*
fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val begining = ListNode(0)
    var ending = begining
    var temp = 0
    var t1 = l1
    var t2 = l2
    while(t1 != null || t2 != null) {
        var v1 = 0
        var v2 = 0
        if(t1 != null) {
            v1 = t1.`val`
            t1 = t1.next
        }
        if(t2 != null) {
            v2 = t2.`val`
            t2 = t2.next
        }
        val nextNode = ListNode((v1 + v2 + temp) % 10 )
        temp = (v1 + v2 + temp) / 10
        ending.next = nextNode
        ending = ending.next!!
    }
    if(temp > 0) {
        val nextNode = ListNode(temp)
        ending.next = nextNode
    }
    return begining.next
}
*/

// with recursion
var begining = ListNode(0)
var ending = begining
var temp = 0

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val v1 = l1?.`val` ?: 0
    val v2 = l2?.`val` ?: 0
    val sum = v1 + v2 + temp
    temp = sum / 10
    begining.next = ListNode(sum % 10)
    begining = begining.next!!
    if(l1?.next != null || l2?.next != null) {
        addTwoNumbers(l1?.next, l2?.next)
    } else if (l1?.next != null) {
        addTwoNumbers(l1.next, ListNode(0))
    } else if (l2?.next != null) {
        addTwoNumbers(ListNode(0), l2.next)
    } else if(temp > 0) {
        begining.next = ListNode(1)
        begining = begining.next!!
    }
    return ending.next
}
fun main() {

}
