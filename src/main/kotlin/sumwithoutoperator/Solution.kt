package sumwithoutoperator

/**
 * Given two integers a and b, return the sum of the two integers without using the operators + and -.
 * @author Shivaprasad
 */
class Solution {

    /**
     * @param x Integer
     * @param y Integer
     *
     * Function that increments / decrements the value of a based on b
     */
    fun getSum(x: Int, y: Int): Int {
        var a = x
        var b = y
        if (b > 0) {
            while (b > 0) {
                a++
                b--
            }
        } else if (b < 0) {
            while (b < 0) {
                a--
                b++
            }
        }
        return a
    }
}

fun main() {
    val solution = Solution()
    println(solution.getSum(1, 2))
}