package src.LinkedList

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

import java.util.PriorityQueue

class ListNode(var `val`: Int) {
   var next: ListNode? = null
}

class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        val pq = PriorityQueue<ListNode> { a, b -> a.`val` - b.`val`}

        var dummy = ListNode(-1)
        var cur = ListNode(-1)

        for(node in lists) {
            if (node != null)
                pq.offer(node)
        }

        while(!pq.isEmpty()) {
            var top = pq.poll()
            if (dummy.next == null) {
                dummy.next = top
                cur = top
            } else {
                cur.next = top
                cur = cur.next!!
            }

            if(top.next != null) pq.offer(top.next)
        }
        return dummy.next
    }
}