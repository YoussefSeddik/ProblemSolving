class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val rowsIndices = matrix.size - 1
        val columnsIndices = matrix[0].size - 1
        for(i in 0..(rowsIndices - 1)/2){
            for(j in 0..(columnsIndices)/2){
                swapeMyMatrix(matrix,arrayOf<Int>(i,j),arrayOf<Int>(i,j),columnsIndices)
            }
        }
    }
    
    fun swapeMyMatrix(matrix: Array<IntArray>, origional:Array<Int>, current:Array<Int>, columnsIndx: Int){
        var newColIndex = columnsIndx - current[0]
        val newPos = arrayOf<Int>(current[1],newColIndex)
        if(origional[0] == newPos[0] && origional[1] == newPos[1]){
            val temp = matrix[current[0]][current[1]]
            matrix[newPos[0]][newPos[1]] = temp
            return
        }
        val temp = matrix[current[0]][current[1]]
        swapeMyMatrix(matrix,origional,newPos,columnsIndx)
        matrix[newPos[0]][newPos[1]] = temp
        
    }
}