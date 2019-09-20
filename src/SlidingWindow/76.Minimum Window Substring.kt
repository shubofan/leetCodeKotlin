package src.SlidingWindow

class Solution {
    fun minWindow(s: String, t: String): String {
        if (s == null || s.length < t.length || s.isEmpty()) return ""

        var map = mutableMapOf<Char,Int?>()

        t.toCharArray().forEach { c -> map[c] = map.getOrDefault(c, 0) + 1 }

        var l = 0
        var r = 0
        var minLeft = 0
        var minRight= 0
        var minLength = s.length
        var foundSubstring = false

        var count = t.length; // the number of characters that I need to match

        // window[l, r]
        while(r < s.length) {
            if(map.containsKey(s[r])) {
                map[s[r]] = map.get(s[r])?.minus(1)
                if(map[s[r]]!! >= 0) count --
            }

            while(count == 0 && l <= r) {
                foundSubstring = true;
                var curLength = r - l + 1

                if(curLength <= minLength) {
                    minLeft = l
                    minRight = r
                    minLength = curLength
                }

                //shrink left runner
                if(map.containsKey(s[l])) {
                    map[s[l]] = map.get(s[l])?.plus(1)
                    if(map[s[l]]!! >= 1) count ++
                }
                l ++
            }
            r ++
        }
        return when(foundSubstring) {
            true -> s.substring(minLeft, minRight + 1)
            else -> ""
        }
    }
}
