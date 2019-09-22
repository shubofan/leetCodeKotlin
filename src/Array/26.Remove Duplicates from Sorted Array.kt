package Array

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        for (j in 1..nums.size - 1) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j]
            }
        }
        return i + 1
    }
}
