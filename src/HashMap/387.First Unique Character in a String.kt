package HashMap

class Solution {
    fun firstUniqChar(s: String): Int {
        var map = mutableMapOf<Char, Int>()

        for(char in s) {
            map[char] = map.getOrDefault(char, 0) + 1
        }

        for(i in s.indices) {
            if(map[s[i]] == 1) return i
        }
        return -1;
    }
}
