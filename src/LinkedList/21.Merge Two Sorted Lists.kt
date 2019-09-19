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
class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var dummyHead: ListNode? = ListNode(0)
        var cur = dummyHead

        var ll1 = l1
        var ll2 = l2

        while(ll1 != null && ll2 != null) {
            if(ll1.`val` < ll2.`val`) {
                cur?.next = ll1
                ll1 = ll1.next
            }
            else if(ll1.`val` >= ll2.`val`) {
                cur?.next = ll2
                ll2 = ll2.next
            }
            cur = cur?.next
        }

        if (ll1 != null) {
            cur?.next = ll1
        }

        if (ll2 != null) {
            cur?.next = ll2
        }
        return dummyHead?.next
    }
}
