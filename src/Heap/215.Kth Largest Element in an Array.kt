package Heap

import java.util.*

class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val priorityQueue = PriorityQueue<Int>(){i1, i2 -> i2 - i1 }


        nums.forEach { num ->
            priorityQueue.offer(num)
            if (priorityQueue.size > k) priorityQueue.poll()
        }
        return priorityQueue.peek()
    }
}
