package strings

import java.util.*

class GroupAnagrams {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val anagramsList = mutableListOf<MutableList<String>>()

        for (str in strs) {
            var added = false
            for (list in anagramsList) {
                if (isAnagram(list[0], str)) {
                    list.add(str)
                    added = true
                    break
                }
            }
            if (!added) anagramsList.add(mutableListOf(str))
        }
        return anagramsList
    }

    private fun isAnagram(s: String, s1: String): Boolean {
        val arr = s.toCharArray().also { Arrays.sort(it) }
        val arr1 = s1.toCharArray().also { Arrays.sort(it) }
        return Arrays.equals(arr, arr1)
    }
}