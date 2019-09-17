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
        var cur = head
        while(cur != null && cur.next != null) {
            var runner = cur
            while(runner?.`val` == cur?.`val`) runner = runner?.next
            cur.next = runner
            cur = cur.next
        }
        return head
    }
}