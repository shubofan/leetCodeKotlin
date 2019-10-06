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
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if(head?.next == null) return head
        var dummy = ListNode(0)
        dummy.next = head

        var pre = dummy
        var cur = head
        var isDuplicate = false

        while(cur != null) {
            if(cur.next != null && cur.`val` == cur.next.`val`) {
                cur.next = cur.next.next
                isDuplicate = true
            } else if(isDuplicate == true) {
                pre.next = cur.next
                cur = cur.next
                isDuplicate = false
            } else {
                pre = pre.next!!
                cur = cur.next
            }
        }
        return dummy.next
    }
}
