package LinkedList

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var sum = 0
        var carry = 0
        var dummyHead = ListNode(0)
        var cur = dummyHead
        var ll1 = l1
        var ll2 = l2

        while(ll1 != null || ll2 != null || carry > 0) {
            sum = carry

            if (ll1 != null) {
                sum += ll1.`val`
                ll1 = ll1.next
            }

            if (ll2 != null){
                sum += ll2.`val`
                ll2 = ll2.next
            }

            carry = sum / 10
            cur.next = ListNode(sum % 10)
            cur = cur.next!!
        }

        return dummyHead.next
    }
}