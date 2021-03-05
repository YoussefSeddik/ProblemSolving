/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var head1: ListNode? = l1
        var head2: ListNode? = l2
        var ans:ListNode? = ListNode(0)
        var current: ListNode? = ans
        var carry = 0

        while (head1 != null || head2 != null) {
            val firstNum = head1?.`val` ?: 0
            val secondNum = head2?.`val` ?: 0
            val sum = firstNum + secondNum + carry
            current?.next = ListNode(sum % 10)
            carry = sum / 10
            current = current?.next
            head1 = head1?.next
            head2 = head2?.next
        }
        if (carry > 0) {
            current?.next = ListNode(carry);
        }
        ans = ans?.next
        return ans
    }
}