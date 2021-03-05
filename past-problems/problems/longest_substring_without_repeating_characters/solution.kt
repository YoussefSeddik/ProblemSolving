class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) return 0
    var maximumLen = 0
    for (i in s.indices) {
        var res = s[i].toString()
        for (j in i+1 until s.length) {
            if (res.contains(s[j])) {
                break
            }else{
                res += s[j].toString()
            }
        }
        if (res.length > maximumLen){
            maximumLen = res.length
        }
    }
    return maximumLen
    }
    
}