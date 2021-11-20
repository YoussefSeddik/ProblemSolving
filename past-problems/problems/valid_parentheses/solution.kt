class Solution {
    fun isValid(s: String): Boolean {
        val dictionary = hashMapOf<String,String>()
        dictionary["("] = ")"
        dictionary["{"] = "}"
        dictionary["["] = "]"
        val stack = ArrayDeque<String>()
        s.forEach{
            val topOfStack = stack.peek()
            if(dictionary[topOfStack]?:"" == it.toString()){
                stack.pop()
            }else{
                stack.push(it.toString())
            }
        }
        return stack.isEmpty()
    }
}