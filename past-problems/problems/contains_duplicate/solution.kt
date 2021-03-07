class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val newSet = nums.toSet()
        return newSet.size != nums.size
    }
}