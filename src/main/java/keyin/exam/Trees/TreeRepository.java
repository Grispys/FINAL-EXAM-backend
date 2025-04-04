package keyin.exam.Trees;


import keyin.exam.BST.BinaryNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreeRepository extends JpaRepository<Tree,Long> {
    Tree findByTree(BinaryNode tree);
    Tree findTopByOrderByIdDesc();
}

