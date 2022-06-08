class Solution {
    fun nextPermutation(nums: IntArray): Unit {
        var left = -1
        var right = 0
        var min = Integer.MAX_VALUE 
        for(i in 0 .. nums.size - 2){
            if(nums[i] < nums[i+1]){
                left = i
            }
        }
        if(left < 0){
            reverse(nums,left+1)
            return
        }
        var j = nums.size-1
        while(j > left){
            if(nums[j] > nums[left]){
                right = j
                break
            }
            j--
        }
        swap(nums, left, right);
        reverse(nums,left+1)
    }
    
    fun swap(nums:IntArray,a:Int, b:Int) {
        val temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    fun reverse(nums:IntArray,low:Int) {
        var left = low;
        var right = nums.size - 1;
        while (left < right) {
            swap(nums, left, right);
            right --
            left++; 
        }
    }
}