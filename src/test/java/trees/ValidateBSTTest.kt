package trees

import org.junit.Test

import org.junit.Assert.*
import trees.ValidateBST.Node

class ValidateBSTTest {

    @Test
    fun isValidBST() {
        val root = Node(5)
        val l1 = Node(1)
        val r1 = Node(4)
        val rl2 = Node(3)
        val rr2 = Node(6)

        root.left = l1
        root.right = r1
        r1.left = rl2
        r1.right = rr2

        ValidateBST().run {
            assertEquals(false, isValidBST(root))

            root.`val` = 5
            l1.`val` = 1
            r1.`val` = 7
            rl2.`val` = 6
            rr2.`val` = 8

            assertEquals(true, isValidBST(root))

            root.`val` = 10
            l1.`val` = 5
            r1.`val` = 15
            rl2.`val` = 6
            rr2.`val` = 20

            assertEquals(false, isValidBST(root))
        }
    }

}