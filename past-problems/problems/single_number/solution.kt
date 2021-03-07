class Solution {
    fun singleNumber(nums: IntArray): Int {
        var minNumOfRepeat = 0
        var minNum = nums[0]
        for (i in nums.indices) {
            var numOfRepeat = 0
            for (j in nums.indices) {
                if (i == j) continue
                if (nums[i] == nums[j]) {
                    numOfRepeat++
                }
            }
            if (numOfRepeat <= minNumOfRepeat) {
                minNumOfRepeat = numOfRepeat
                minNum = nums[i]
            }
        }
        return minNum
    }
}