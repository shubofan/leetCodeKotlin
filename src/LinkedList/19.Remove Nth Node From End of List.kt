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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var dummyHead: ListNode? = ListNode(0)
        var runner = head
        var cur = head
        dummyHead?.next = head
        var m = n
        while (m > 0) {
            runner = runner?.next
            m --;
        }

        if (runner == null) {

            return head?.next
        }

        while(runner?.next != null) {
            cur = cur?.next;
            runner = runner?.next
        }

        cur?.next = cur?.next?.next

        return dummyHead?.next;
    }
}