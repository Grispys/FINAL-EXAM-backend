package keyin.exam.Trees;


import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import keyin.exam.BST.BinaryNode;
import org.hibernate.annotations.Type;


@Entity
public class Tree {
    @Id
    @SequenceGenerator(name = "tree_sequence", sequenceName = "tree_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "tree_sequence")
    private long id;

    @Type(JsonType.class)
    @Column(columnDefinition = "json")
    private BinaryNode tree;

    public Tree(){

    }

    public Tree(BinaryNode name){
        this.tree = name;
    }


    public BinaryNode getName() {
        return tree;
    }

    public void setName(BinaryNode tree) {
        this.tree = tree;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
