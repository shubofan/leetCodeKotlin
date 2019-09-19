package src.BinarySearch

class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        var res = intArrayOf(-1, -1)
        var l = 0
        var r = nums.size - 1
        if(r == -1 ||nums[0] > target || nums[r] < target) return res

        // find 1st
        while(l <= r) {
            var mid = (r + l) / 2
            if(nums[mid] >= target) r = mid - 1
            else l = mid + 1
        }
        if(nums[l] == target) res[0] = l

        l = 0
        r = nums.size - 1

        // find last
        while(l <= r) {
            var mid = (r + l) / 2
            if(nums[mid] <= target) l = mid + 1
            else r = mid  - 1
        }
        if(nums[r] == target) res[1] = r

        return res
    }
}
