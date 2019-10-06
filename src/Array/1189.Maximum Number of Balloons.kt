package Array

class Solution {
    fun maxNumberOfBalloons(text: String): Int {
        var cnt = IntArray(26)

        for (char in text) {
            cnt[char - 'a'] ++
        }
        return minOf(minOf(cnt[0], cnt[1], cnt[11]/2) , minOf(cnt[13], cnt[14]/2))
    }
}
