package keyin.exam.BST;



import java.io.Serializable;

public class BinarySearchTree implements Serializable {




    public BinaryNode root;

    public BinarySearchTree() {
        root = null;
    }

// takes a value and sequentially inserts it into a tree dependent on the size of the number and previous numbers
    public BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public int getRoot() {
        return root.value;
    }

    public int getRight(){
        return root.getRight().value;
    }

    public int getLeft(){
        return root.getLeft().value;
    }

}

