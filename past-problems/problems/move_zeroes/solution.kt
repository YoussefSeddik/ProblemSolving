class Solution {
    fun moveZeroes(nums: IntArray): IntArray {
        var lastNonZeroFoundAt = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i]
                if(lastNonZeroFoundAt != i){
                   nums[i] = 0
                }
                lastNonZeroFoundAt++
            }
        }
        return nums
    }
}