class Solution {
    fun romanToInt(s: String): Int {
        val dictionary = hashMapOf<String, Int>()
        dictionary.put("I", 1)
        dictionary.put("V", 5)
        dictionary.put("X", 10)
        dictionary.put("L", 50)
        dictionary.put("C", 100)
        dictionary.put("D", 500)
        dictionary.put("M", 1000)
        var sum = 0
        var i = 0
        while (i < s.length-1) {
            val current = s[i].toString()
            val next = s[i+1].toString()
            if (dictionary[current]?:0 >= dictionary[next]?:0) {
                 sum += dictionary[current] ?: 0
            } else {
                 sum -= dictionary[current] ?: 0
            }
            i++
        }
        sum += dictionary[s.last().toString()]?: 0
        return sum
    }
}