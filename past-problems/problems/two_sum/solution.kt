class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        for(i in nums.indices){
            for(j in i+1 .. nums.size - 1){
                if(nums[j] + nums[i] == target){
                    result[0] = i
                    result[1] = j
                }
                
            }
        }
        return result
    }
}