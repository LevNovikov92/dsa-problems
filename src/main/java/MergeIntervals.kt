import java.util.*

/**
 * Definition for an interval.
 * class Interval(
 *     var start: Int = 0,
 *     var end: Int = 0
 * )
 */

/**
 * Input: [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 */

data class Interval(var start: Int = 0, var end: Int = 0)

class MergeIntervals {
    fun merge(intervals: List<Interval>): List<Interval> {
        if (intervals.isEmpty()) return emptyList()
        val sortedIntervals = intervals.sortedBy { o -> o.start }
        val stack = Stack<Int>()
        stack.push(sortedIntervals[0].start)
        stack.push(sortedIntervals[0].end)

        for (i in 1 until sortedIntervals.size) {
            if (sortedIntervals[i].start <= stack.peek() && sortedIntervals[i].end > stack.peek()) {
                stack.pop()
                stack.push(sortedIntervals[i].end)
            } else if (sortedIntervals[i].start <= stack.peek() && sortedIntervals[i].end <= stack.peek()) {
                //do nothing
            } else {
                stack.add(sortedIntervals[i].start)
                stack.add(sortedIntervals[i].end)
            }
        }

        val list = mutableListOf<Interval>()
        stack.toList().forEachIndexed { index, v ->
            if (index % 2 == 0) {
                list.add(Interval(v, 0))
            } else {
                list[list.size - 1].end = v
            }
        }
        return list
    }
}