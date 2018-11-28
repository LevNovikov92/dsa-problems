import org.junit.Test

import org.junit.Assert.*

class MergeIntervalsTest {

    @Test
    fun merge() {
        MergeIntervals().apply {
            assertEquals(
                    listOf(
                            Interval(1, 6),
                            Interval(8, 10),
                            Interval(15, 18)
                    ),
                    merge(
                            listOf(
                                    Interval(2, 6),
                                    Interval(1, 3),
                                    Interval(8, 10),
                                    Interval(15, 18)
                            )
                    )
            )
            assertEquals(
                    listOf(
                            Interval(1, 6),
                            Interval(8, 10),
                            Interval(15, 18)
                    ),
                    merge(
                            listOf(
                                    Interval(2, 5),
                                    Interval(1, 6),
                                    Interval(8, 10),
                                    Interval(15, 18)
                            )
                    )
            )
            assertEquals(
                    listOf<Interval>(),
                    merge(listOf())
            )
            assertEquals(
                    listOf(Interval(0, 2)),
                    merge(listOf(Interval(0, 2)))
            )
        }
    }
}