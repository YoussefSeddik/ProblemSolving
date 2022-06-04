class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val rows = matrix.size
        val columns = matrix[0].size
        val columnsShouldBeZero = Array(columns){false}
        val rowsShouldBeZero = Array(rows){false}

        for(i in 0 .. rows - 1){
            for(j in 0 .. columns - 1){
                val a = matrix[i][j]
                if(a == 0){
                    rowsShouldBeZero[i] = true
                    columnsShouldBeZero[j] = true
                }
            }
        }
        
        for(i in 0 .. rows - 1){
            for(j in 0 .. columns - 1){
                if(rowsShouldBeZero[i] == true || columnsShouldBeZero[j] == true){
                    matrix[i][j] = 0
                }

            }
        }
        
        
    }
}