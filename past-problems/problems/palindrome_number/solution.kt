class Solution {
    fun isPalindrome(x: Int): Boolean {
        var rev_num = 0
        var temp_x = x
        while (temp_x > 0){
            rev_num = rev_num*10 + temp_x%10
            temp_x = temp_x/10
        }
        return rev_num == x
    }
}
