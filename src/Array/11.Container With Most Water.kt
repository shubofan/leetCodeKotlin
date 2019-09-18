package Array

class Solution {
    fun maxArea(height: IntArray): Int {
        var l = 0
        var r = height.size - 1
        var res = 0
        while(l < r) {
            var area = Math.min(height[l], height[r]) * (r - l)
            res = Math.max(res, area)
            if(height[l] < height[r]) l ++
            else r --
        }
        return res
    }
}