class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val result = mutableListOf<MutableList<Int>>()
        result.add(0, mutableListOf(1))
        var numOfColumns = 1
        for(i in 1 .. numRows-1){
            val childList = mutableListOf<Int>()
            for(j in 0 .. numOfColumns){
                val currentJInPrevRow = result[i-1].getOrNull(j-1)?:0
                val prevJInPrevRow = result[i-1].getOrNull(j)?:0
                childList.add(currentJInPrevRow+prevJInPrevRow)
            }
            result.add(i, childList)
            numOfColumns++
        }
        return result
    }
}