class Solution {
    fun moveZeroes(nums: IntArray): IntArray {
        var lastNonZeroFoundAt = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i]
                lastNonZeroFoundAt++
            }
        }
        for (i in lastNonZeroFoundAt until nums.size) {
            nums[i] = 0
        }
        return nums
    }
}