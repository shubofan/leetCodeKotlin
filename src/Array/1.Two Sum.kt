package Array

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map = mutableMapOf<Int, Int>()
        for(i in nums.indices) {
            var reminder = target - nums[i]
            if(map.containsKey(reminder)) {
                return intArrayOf(i, map[reminder]!!)
            }
            else map[nums[i]] = i
        }
        return intArrayOf()
    }
}
