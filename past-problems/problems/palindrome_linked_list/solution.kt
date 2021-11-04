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
    fun isPalindrome(head: ListNode?): Boolean {
        var temp = head
        var slow = head
        val stack = Stack<Int>()
        while (slow != null) {
            stack.push(slow.`val`)
            slow = slow.next
        }
        while (temp != null) {
            val popped = stack.pop()
            if (popped != temp.`val`) {
                return false
            }
            temp = temp?.next
        }
        return true
    }
}