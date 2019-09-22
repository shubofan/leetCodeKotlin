package Math

class Solution {
    fun isPalindrome(x: Int): Boolean {
        if(x < 0) return false
        var origin = x
        var reversed = 0
        while(origin > 0) {
            var reminder = origin % 10
            origin /= 10
            reversed = reversed * 10 + reminder
        }
        return reversed == x
    }
}
