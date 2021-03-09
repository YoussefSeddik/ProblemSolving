class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val res = IntArray(2)
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                val sum = nums[i] + nums[j]
                if (sum == target) {
                    res[0] = i
                    res[1] = j
                    return res
                }
            }

        }
        return res
    }
}