package longestsubstring

import longestsubstring.Solution.Companion.stringValue

class Solution {
    /**
     * Function to find the length of longest substring
     * without repeating characters
     * @param string String
     */
    fun lengthOfLongestSubstring(string: String): Int {
        var length = 0

        var i = -1
        var j = -1

        val map = HashMap<Char, Int>()
        while (true) {
            var loopOneEntry = false
            var loopTwoEntry = false

            // Acquire
            while (i < string.length - 1) {
                loopOneEntry = true
                i++
                val ch = string[i]
                map[ch] = map.getOrDefault(ch, 0) + 1

                if (map[ch] == 2) {
                    break
                } else {
                    val l = i - j
                    if (l > length) {
                        length = l
                    }
                }
            }

            // Release
            while (j < i) {
                loopTwoEntry = true
                j++
                val c = string[j]
                map[c] = map.getOrDefault(c, 0) - 1

                if (map[c] == 1) {
                    break
                }
            }

            if (!loopOneEntry && !loopTwoEntry) {
                break
            }
        }

        return length
    }

    companion object {
        const val stringValue = "abcdabbabccdaddac"
    }
}

fun main() {
    val solution = Solution()
    println(
        solution.lengthOfLongestSubstring(stringValue)
    )
}