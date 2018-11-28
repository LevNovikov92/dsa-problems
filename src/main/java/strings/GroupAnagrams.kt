package strings

import java.util.*

class GroupAnagrams {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val anagramsList = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {
            val arr = str.toCharArray().also { Arrays.sort(it) }
            if (anagramsList[String(arr)]?.add(str) == null) {
                anagramsList[String(arr)] = mutableListOf(str)
            }
        }
        return anagramsList.values.toList()
    }
}