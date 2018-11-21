package strings

import org.junit.Test

import org.junit.Assert.*

class GroupAnagramsTest {

    @Test
    fun groupAnagrams() {
        val result = GroupAnagrams().groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
        assertTrue(result[0].contains("eat"))
        assertTrue(result[0].contains("tea"))
        assertTrue(result[0].contains("ate"))
        assertTrue(result[1].contains("tan"))
        assertTrue(result[1].contains("nat"))
        assertTrue(result[2].contains("bat"))
    }

    @Test
    fun groupAnagramsTest() {
        val result = GroupAnagrams().groupAnagrams(arrayOf("hos","boo","nay","deb","wow","bop","bob","brr","hey","rye","eve","elf","pup","bum","iva","lyx","yap","ugh","hem","rod","aha","nam","gap","yea","doc","pen","job","dis","max","oho","jed","lye","ram","pup","qua","ugh","mir","nap","deb","hog","let","gym","bye","lon","aft","eel","sol","jab"))
        print(result)
    }
}