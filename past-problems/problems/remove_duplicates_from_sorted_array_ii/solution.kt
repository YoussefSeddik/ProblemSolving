class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var i = 0
        var numOfequals = 1
        for (j in 1 until nums.size) {
            if (nums[j] == nums[i] && numOfequals<2) {
                numOfequals++
                i++
            } else if(nums[j] != nums[i]){
                numOfequals = 1
                i++
            }
            nums[i] = nums[j]
        }
        return i + 1
    }
}