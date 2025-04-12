package keyin.exam;

import keyin.exam.BST.BinarySearchTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;


public class TestRest {
    @Mock
    private RestExamApp mockRESTapp;

    @Test
    public void testBinarySearchTreeRoot() {
//        this tests that the binary search tree indeed sorts items properly, specifically checking that 34 becomes the root
        int[] insertable ={34,73,2,94};
        BinarySearchTree bst = new BinarySearchTree();
        for(int i =0; i < insertable.length;i++){
            bst.insert(insertable[i]);
        }
        Assertions.assertEquals(34,bst.getRoot());
    }

    @Test
    public void testBinarySearchTreeRight() {
//      tests that the binary search tree sorts numbers larger than previous to the right
        int[] insertable ={34,2,73,94};
        BinarySearchTree bst = new BinarySearchTree();
        for(int i =0; i < insertable.length;i++){
            bst.insert(insertable[i]);
        }
        Assertions.assertEquals(34,bst.getRoot());
        Assertions.assertEquals(73, bst.getRight());
    }

    @Test
    public void testBinarySearchTreeLeft() {
//      tests that the binary search tree sorts numbers smaller than previous to the left
        int[] insertable ={34,2,73,94};
        BinarySearchTree bst = new BinarySearchTree();
        for(int i =0; i < insertable.length;i++){
            bst.insert(insertable[i]);
        }
        Assertions.assertEquals(34,bst.getRoot());
        Assertions.assertEquals(2, bst.getLeft());
    }
}
