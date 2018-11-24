class CombinationSumNotUnique {

    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val resultList = mutableListOf<List<Int>>()
        combinationSum(candidates, target, emptyList(), resultList)
        return resultList
    }

    private fun combinationSum(candidates: IntArray, target: Int, initialList: List<Int>, resultsList: MutableList<List<Int>>) {
        for (c in candidates) {
            if (c == target) {
                val list = mutableListOf<Int>().apply {
                    addAll(initialList)
                    add(c)
                }.sortedBy { it }
                if (!resultsList.contains(list)) resultsList.add(list)
            } else if (c < target) {
                combinationSum(
                        candidates,
                        target - c,
                        mutableListOf<Int>().apply {
                            addAll(initialList)
                            add(c)
                        },
                        resultsList
                )
            }
        }
    }
}