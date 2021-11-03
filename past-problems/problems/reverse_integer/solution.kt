class Solution {
fun reverse(x: Int): Int {
    val isSigned = x < 0
    var reversed = ""
    var dividingRes = x
    if (isSigned){
        dividingRes *= -1
    }
    while (dividingRes > 0) {
        reversed += (dividingRes % 10).toString()
        dividingRes /= 10
    }
    return try {
        var res = reversed.toInt()
        if (isSigned){
            res *= -1
        }
        res
    } catch (e: Exception) {
        0
    }
}

}