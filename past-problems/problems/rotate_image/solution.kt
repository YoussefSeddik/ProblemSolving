class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val n = matrix[0].size-1
        for (i in 0..n) {
            for (j in i..n) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }
        for (i in 0..n) {
            for (j in 0..n / 2) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[i][n-j]
                matrix[i][n-j] = temp
            }
        }
    }
}