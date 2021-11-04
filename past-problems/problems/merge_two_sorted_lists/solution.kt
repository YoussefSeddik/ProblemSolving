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
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var h1 = l1
        var h2 = l2
        val tempNode = ListNode(0)
        var currentNode: ListNode? = tempNode
        while (h1 != null && h2 != null) {
            if (h1.`val` < h2.`val`) {
                currentNode?.next = h1
                h1 = h1.next
            } else {
                currentNode?.next = h2
                h2 = h2.next
            }
            currentNode = currentNode?.next
        }
        if (h1 != null){
            currentNode?.next = h1
        }
        if (h2 != null){
            currentNode?.next = h2
        }
        return tempNode.next
    }
}