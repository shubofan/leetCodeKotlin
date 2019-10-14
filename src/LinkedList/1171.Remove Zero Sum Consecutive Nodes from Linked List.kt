package LinkedList

class Solution {
	fun removeZeroSumSublists(head: ListNode?): ListNode? {
		var dummy: ListNode? = ListNode(0)
		dummy?.next = head
		var cur: ListNode? = dummy

		var m = mutableMapOf<Int, ListNode?>()
		var prefixSum = 0

		while(cur != null) {
			prefixSum += cur.`val`
			if(prefixSum in m) {
				cur = m[prefixSum]?.next!!
				var subSum = cur.`val` + prefixSum
				while(subSum != prefixSum) {
					m.remove(subSum)
					cur = cur?.next!!
					subSum += cur.`val`
				}
				m[prefixSum]?.next = cur?.next
			}
			else {
				m[prefixSum] = cur
			}
			cur = cur?.next
		}
		return dummy?.next
	}
}