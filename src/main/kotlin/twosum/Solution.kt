package twosum

/**
 * Given an array of integers and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * @author Shivaprasad Bhat
 * @date 04-Sep-2021
 */
class Solution {
    /**
     * Solution Code
     * @param nums IntArray
     * @param target Integer
     *
     * Function that compares the values based on indices
     * If the sum is equal to the target sent, returns a new array with indices added
     * Else returns an empty array
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val len = nums.size
        for (i in 0 until len) {
            for (j in i + 1 until len) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()

    }

}

fun main() {
    val array: IntArray = intArrayOf(2, 7, 11, 15)
    val target = 9

    val solution = Solution()
    val result = solution.twoSum(array, target)
    for (i in result)
        print("$i   ")
}