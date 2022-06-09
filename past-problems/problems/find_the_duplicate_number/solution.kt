class Solution {
    fun findDuplicate(nums: IntArray): Int {
        val resSet = hashSetOf<Int>()
        nums.forEach {
            if(!resSet.add(it)){
                return it
            }
        }
        return -1
    }
}