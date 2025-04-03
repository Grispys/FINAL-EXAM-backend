package keyin.exam.Trees;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import keyin.exam.BST.BinaryNode;
import keyin.exam.BST.BinarySearchTree;

import java.security.PrivateKey;

@Entity
public class Tree {
    @Id
    @SequenceGenerator(name = "tree_sequence", sequenceName = "tree_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "tree_sequence")
    private long id;


    private String tree;

    public Tree(){

    }

    public Tree(String name){
        this.tree = name;
    }


    public String getName() {
        return tree;
    }

    public void setName(String tree) {
        this.tree = tree;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
