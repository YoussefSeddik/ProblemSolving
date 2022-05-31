class Solution {
public:
    bool isPalindrome(int x) {
        double rev_num = 0;
        int temp_x = x;
        while (temp_x > 0){
            rev_num = rev_num*10 + temp_x%10;
            temp_x = temp_x/10;
        }
        return rev_num == x ;
    }
};