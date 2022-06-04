class Solution {
    fun sortColors(nums: IntArray): Unit {
        var mid = 0
        var low = 0
        var temp = 0
        var high = nums.size-1
        while(mid <= high){
            if(nums[mid] == 0){
                temp = nums[low]
                nums[low] = nums[mid]
                nums[mid] = temp
                low++
                mid++
            }else if(nums[mid] == 1){
                mid++
            }else{
                temp = nums[mid]
                nums[mid] = nums[high]
                nums[high] = temp
                high--
            }
        }
    }
}