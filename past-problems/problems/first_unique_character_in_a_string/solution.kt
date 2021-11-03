class Solution {
    fun firstUniqChar(s: String): Int {
      for (i in s.indices) {
        var isMatched = false
        val ai = s[i]
        for (j in s.indices) {
            if (i == j) continue
            val bi = s[j]
            isMatched = ai == bi
            if (isMatched){
              break
            }
        }
        if (isMatched.not()){
            return i
        }
    }
    return -1
    }
}