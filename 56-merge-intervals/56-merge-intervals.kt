class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy{ it[0] }
        val result = mutableListOf<IntArray>()
        intervals.forEach{
            if(result.isEmpty() || result.last()[1] < it[0]) {
                result.add(it)
            } else {
                result.last()[1] = maxOf(result.last()[1], it[1])
            }
        }
        return result.toTypedArray()
    }
}