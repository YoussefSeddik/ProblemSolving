class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var strIndex = 0
        var commonPrefix = ""
        var smallestStr = strs.first()
        while(strIndex < smallestStr.length){
            var prefixOfSmallest = smallestStr[strIndex]
            var hasCommonPrefix = true
            strs.forEach{
                var prefixOfStrs = it.getOrNull(strIndex)
                hasCommonPrefix = prefixOfSmallest == prefixOfStrs
                if(hasCommonPrefix.not()){
                    return commonPrefix
                }
            }
            commonPrefix += prefixOfSmallest
            strIndex++
        }
        return commonPrefix
    }
}