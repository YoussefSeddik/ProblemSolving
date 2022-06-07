class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val rows = matrix.size - 1
        val cols = matrix[0].size - 1
        for(i in 0.. rows /2){
            for(j in 0..(cols-1) /2){
                var newJ = cols - i
                val temp = matrix[newJ][cols-j]
                matrix[newJ][cols-j] = matrix[j][newJ]
                matrix[j][newJ] = matrix[i][j]
                matrix[i][j] = matrix[cols-j][cols-newJ]
                matrix[cols-j][cols-newJ] = temp
            }
        }
    }
    
}