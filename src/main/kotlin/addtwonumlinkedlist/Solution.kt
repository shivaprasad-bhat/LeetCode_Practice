package addtwonumlinkedlist

class ListNode(var `val`: Int) {
    var next: ListNode? = null

}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val answer: ListNode = ListNode(0)
        var p = l1
        var q = l2
        var cur = answer
        var carry = 0

        while (p != null || q != null) {
            val x: Int = p?.`val` ?: 0
            val y: Int = q?.`val` ?: 0
            val sum = carry + x + y
            carry = sum / 10
            cur.next = ListNode(sum % 10)
            cur = cur.next!!

            p = p?.next
            q = q?.next
        }

        if (carry > 0) {
            cur.next = ListNode(carry)
        }
        return answer.next
    }
}