class Solution {

    fun plusOne(digits: IntArray): IntArray {
        var flag = 0
        var sum: Int
        var carry = 0
        var i = digits.size - 1
        while (i >= 0) {
            if (flag == 0) {
                flag = 1
                sum = digits[i] + 1
                digits[i] = sum % 10
                carry = if (sum >= 10) 1 else 0
            } else {
                sum = digits[i] + carry
                digits[i] = sum % 10
                carry = if (sum >= 10) 1 else 0
            }
            i--
        }
        if (carry == 1) {
            val resArray = IntArray(digits.size + 1)
            resArray[0] = carry
            for (j in 1..digits.size) {
                resArray[j] = digits[j - 1]
            }
            return resArray
        }
        return digits
    }
}