class Solution {
    fun intersect(n1: IntArray, n2: IntArray): IntArray {
        val nums1 = n1.sortedArray()
        val nums2 = n2.sortedArray()
        var i = 0
        var j = 0
        var result = mutableListOf<Int>()
        while (i < nums1.size && j < nums2.size) {
            when {
                nums1[i] < nums2[j] -> {
                    i++
                }
                nums1[i] > nums2[j] -> {
                    j++
                }
                else -> {
                    result.add(nums1[i])
                    i++
                    j++
                }
            }
        }
        return result.toIntArray()
    }
}