package HashMap

class Solution {
    fun firstUniqChar(s: String): Int {
        var map = mutableMapOf<Char, Int>()

        for(char in s) {
            map.put(char, map.getOrDefault(char, 0) + 1)
        }

        for(i in 0..s.length - 1) {
            if(map[s.get(i)] == 1) return i
        }
        return -1;
    }
}