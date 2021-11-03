class Solution {
fun plusOne(digits: IntArray): IntArray {
    var i = digits.size - 1
    while (i >= 0) {
        if (digits[i] < 9) {
            digits[i]++
            return digits
        }
        digits[i] = 0
        i--
    }
    val resultArray = IntArray(digits.size+1){0}
    resultArray[0] = 1
    return resultArray
}
}