package Heap

import java.util.*

class Solution {
    fun topKFrequent(nums: IntArray, k: Int): List<Int> {
        var res = mutableListOf<Int>()
        var map = mutableMapOf<Int, Int>()
        val pq = PriorityQueue<Int>(){n1, n2 -> map[n1]!!.minus(map[n2]!!)}

        // O(n)
        for(n in nums) {
            map[n] = map.getOrDefault(n, 0) + 1
        }
        //O(N * logK)
        for(key in map.keys){
            pq.offer(key)
            if(pq.size > k) pq.poll()
        }

        while(!pq.isEmpty()) res.add(pq.poll())
        return res
    }
}
