package SlidingWindow

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if(s == null || s == "") return 0
        var res = 0
        var m = mutableMapOf<Char, Int>()
        var j = 0
        // [j, i] sliding window
        for (i in s.indices) {
            if (m.contains(s[i])) {
                j = maxOf(j, m[s[i]]?.plus(1)!!)
            }
            m[s[i]] = i
            res = maxOf(res, i - j + 1)
        }
        return res
    }
}

