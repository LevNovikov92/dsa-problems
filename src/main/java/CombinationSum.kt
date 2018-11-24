class CombinationSum {


    // 2,3,6,7
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        return combinationSum(candidates, 0, target, emptyList())
    }

    private fun combinationSum(candidates: IntArray, fromIndex: Int, target: Int, initialList: List<Int>): List<List<Int>> {
        val list = mutableListOf<List<Int>>()
        for (i in fromIndex until candidates.size) {
            if (candidates[i] == target) {
                val newList: List<Int> = mutableListOf<Int>().apply {
                    addAll(initialList)
                    add(candidates[i])
                }.sortedBy { it }
                if (!list.contains(newList)) list.add(newList)
            } else if (candidates[i] < target && i < candidates.size - 1) {
                        combinationSum(
                                candidates,
                                i + 1,
                                target - candidates[i],
                                mutableListOf<Int>().apply {
                                    addAll(initialList)
                                    add(candidates[i])
                                }
                        ).forEach {
                            if (!list.contains(it)) {
                                list.add(it)
                            }
                        }
            }
        }
        return list
    }
}