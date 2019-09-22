package String

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs == null || strs.isEmpty()) return ""

        var str = strs[0]
        if(str == null || str == "") return ""

        var sb = StringBuilder()
        var index = 0

        for(c in str.toCharArray()) {
            for(i in 1 until strs.size) {
                var s = strs[i]
                if(s == null || s == "") return ""
                if(index > s.length - 1 || c != strs[i][index]) return sb.toString()
            }
            index ++
            sb.append(c)
        }
        return sb.toString()
    }
}
