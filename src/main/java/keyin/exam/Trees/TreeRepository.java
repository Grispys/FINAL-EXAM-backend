package keyin.exam.Trees;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreeRepository extends JpaRepository<Tree,Long> {
    Tree findByName(String name);
    Tree findTopByOrderByIdDesc();
}

