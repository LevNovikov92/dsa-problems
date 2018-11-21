package strings

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class ZigZagTest {

    @Test
    fun convert() {
        Assert.assertEquals("PAHNAPLSIIGYIR", ZigZag().convert("PAYPALISHIRING", 3))
        Assert.assertEquals("PINALSIGYAHRPI", ZigZag().convert("PAYPALISHIRING", 4))
        Assert.assertEquals("PI", ZigZag().convert("PI", 1))
    }
}