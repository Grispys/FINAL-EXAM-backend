package keyin.exam.Trees;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import keyin.exam.BST.BinaryNode;

import java.security.PrivateKey;

@Entity
public class Tree {
    @Id
    @SequenceGenerator(name = "tree_sequence", sequenceName = "tree_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "tree_sequence")
    private long id;

//    @OneToOne(cascade = CascadeType.ALL)
//    private BinaryNode root;

    private String name;

    public Tree(){

    }

    public Tree(String name){
//        this.root = root;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
