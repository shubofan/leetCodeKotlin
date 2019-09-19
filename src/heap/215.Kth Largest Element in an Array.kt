package heap

import java.util.*

class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val priorityQueue = PriorityQueue<Int>()
        nums.forEach { num ->
            priorityQueue.offer(num)
            if (priorityQueue.size > k) priorityQueue.poll()
        }
        return priorityQueue.peek()
    }
}