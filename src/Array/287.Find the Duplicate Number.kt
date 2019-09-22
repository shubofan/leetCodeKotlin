package Array

class Solution {
    fun findDuplicate(nums: IntArray): Int {
        var fast = 0
        var slow = 0
        if(nums[slow] == nums[nums[fast]]) return nums[slow]
        while(true) {
            slow = nums[slow]
            fast = nums[nums[fast]]
            if (slow == fast) break;
        }
        slow = 0
        while(slow != fast) {
            slow = nums[slow]
            fast = nums[fast]
        }
        return slow
    }
}
