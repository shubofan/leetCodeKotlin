package Stack

import java.util.Stack

class Solution {
    fun isValid(s: String): Boolean {
        if(s == null || s.length < 1 ) return true
        var stack = Stack<Char>()

        for(char in s.toCharArray()) {
            if(!stack.empty()) {
                if (stack?.peek() == '{' && char == '}' || stack?.peek() == '[' && char == ']' || stack?.peek() == '(' && char == ')' )
                    stack.pop()
                else
                    stack.push(char)
            }
            else
                stack.push(char)
        }
        return stack.isEmpty()
    }
}