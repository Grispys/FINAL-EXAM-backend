package keyin.exam.BST;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class BinaryNode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int value;



    @OneToOne(cascade = CascadeType.ALL)
    public BinaryNode left;

    @OneToOne(cascade = CascadeType.ALL)
    public BinaryNode right;
}
