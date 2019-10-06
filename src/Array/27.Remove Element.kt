package Array

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var newLength = 0

        for(i in nums.indices) {
            if(nums[i] != `val`) nums[newLength ++] = nums[i]
        }
        return newLength
    }
}
