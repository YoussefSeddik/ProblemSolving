class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var curSum = 0
        var maxSum = nums[0]
        for(i in 0..nums.size-1){
            if (curSum < 0) {
                curSum = 0
            }
            curSum += nums[i]
            maxSum = Math.max(maxSum, curSum)
        }
        return maxSum
    }
}