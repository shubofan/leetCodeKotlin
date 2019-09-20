package src.Array

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        var l = 0
        var r = nums.size - 1
        var res = arrayListOf<List<Int>>()
        if (r < 2) return res

        for(i in 0..r - 2) {
            if(i > 0 && nums[i] == nums[i - 1]) continue
            var k = r
            var j = i + 1
            while(k > j) {
                if(nums[i] + nums[j] + nums[k] == 0) {
                    res.add(arrayListOf<Int>(nums[i], nums[j], nums[k]))
                    j ++
                    k --
                    while(j < k && nums[j] == nums[j - 1]) j ++
                    while(j < k && nums[k] == nums[k + 1]) k --
                } else if(nums[i] + nums[j] + nums[k] > 0)
                    k --
                else
                    j ++
            }
        }
        return res
    }
}
