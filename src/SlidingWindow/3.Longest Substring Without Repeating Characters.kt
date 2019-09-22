package SlidingWindow

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if(s == null || s == "") return 0
        var res = 0
        var m = mutableMapOf<Char, Int>()
        var j = 0
        var i = 0
        // [j, i] sliding window
        for (i in 0..s.length - 1) {
            if (m.contains(s.get(i))) {
                j = Math.max(j, m.get(s.get(i))?.plus(1)!!)
            }
            m.put(s.get(i), i)
            res = Math.max(res, i - j + 1)
        }
        return res
    }
}
