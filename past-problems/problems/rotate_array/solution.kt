class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        for (i in 1..k) {
        var prevNum = nums[0]
        for (j in 1 until nums.size) {
            val temp = nums[j]
            nums[j] = prevNum
            prevNum = temp
            if (j + 1 == nums.size) {
                nums[0] = prevNum
            }
        }
    }
    }
}