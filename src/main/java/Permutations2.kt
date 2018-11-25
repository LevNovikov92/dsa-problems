class Permutations2 {

    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val list = mutableListOf<List<Int>>()
        permuteUnique(nums.toList(), emptyList(), list)
        return list
    }

    private fun permuteUnique(toShuffle: List<Int>, prefix: List<Int>, resultList: MutableList<List<Int>>) {
        if (toShuffle.size == 1) {
            val candidate = mutableListOf<Int>()
                    .apply {
                        addAll(prefix)
                        addAll(toShuffle)
                    }
            if (!resultList.contains(candidate)) resultList.add(candidate)
            return
        }

        for(i in toShuffle) {
            permuteUnique(
                    toShuffle.toMutableList().apply { remove(i) },
                    prefix.toMutableList().apply { add(i) },
                    resultList
            )
        }
    }
}