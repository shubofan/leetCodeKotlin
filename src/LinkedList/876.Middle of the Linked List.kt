package LinkedList

class Solution {
	fun middleNode(head: ListNode?): ListNode? {
		var fst = head
		var slo = head
		while(fst?.next != null) {
			slo = slo?.next
			fst = fst?.next?.next
		}
		return slo
	}
}
