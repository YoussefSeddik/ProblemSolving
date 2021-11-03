class Solution {
    fun reverseString(s: CharArray): Unit {
        var start = 0
        var end = s.size - 1
        while (start <= end) {
            val temp = s[start]
            s[start] = s[end]
            s[end] = temp
            start++
            end--

        }
    }
}