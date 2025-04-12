package keyin.exam.BST;

import jakarta.persistence.*;
public class BinaryNode {



    private Long id;

    public int value;

    public BinaryNode left;


    public BinaryNode right;



//    these two created with sole purpose in testing class!
    public BinaryNode getRight() {
        return right;
    }

    public BinaryNode getLeft() {
        return left;
    }

}