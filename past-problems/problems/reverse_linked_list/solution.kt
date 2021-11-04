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
    fun reverseList(head: ListNode?): ListNode? {
        var h = head
        var t = h?.next
        h?.next = null
        while (t != null){
            val temp = t.next
            t.next = h
            h = t
            t = temp
        }
        return h  
    }
}