package Array

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var newLength = 0

        for(i in 0..nums.size - 1) {
            if(nums[i] != `val`) nums[newLength ++] = nums[i]
        }
        return newLength
    }
}