class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val taken = MutableList(nums.size){false}
        return permutate(nums,taken,mutableListOf())
    }
    
    private fun permutate(nums: IntArray, taken: MutableList<Boolean>, 
                          prefix: MutableList<Int>): MutableList<MutableList<Int>>{
        val res = mutableListOf<MutableList<Int>>()
        if(prefix.size == nums.size){
            val newPrefix = mutableListOf<Int>()
            newPrefix.addAll(prefix)
            res.add(newPrefix)
        }
        for(i in 0..nums.size-1){
            if(taken[i]){
                continue;
            }
            taken[i] = true
            prefix.add(nums[i])
            res.addAll(permutate(nums,taken,prefix))
            prefix.removeAt(prefix.size - 1)
            taken[i] = false
        }
        return res
    }
    
    
}