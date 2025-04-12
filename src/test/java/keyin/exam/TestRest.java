package keyin.exam;

import keyin.exam.BST.BinaryNode;
import keyin.exam.BST.BinarySearchTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestRest {
//    @Mock
//    private RESTClient mockRESTClient;

    @Test
    public void testBinarySearchTree() {
//        this tests that the binary search tree indeed sorts items properly, specifically checking that 34 becomes the root
        TestRest testRest = new TestRest();
        int[] insertable ={34,73,2,94};
        BinarySearchTree bst = new BinarySearchTree();
        for(int i =0; i < insertable.length;i++){
            bst.insert(insertable[i]);
        }
        Assertions.assertEquals(34,bst.getRoot());
    }
}