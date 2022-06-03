class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var max = Integer.MIN_VALUE;
        var sum = 0
        for(i in 0 .. nums.size-1){
            sum += nums[i]
            max = Math.max(sum,max)
            if(sum < 0){
                sum = 0
            }
        }
        return max
    }
}