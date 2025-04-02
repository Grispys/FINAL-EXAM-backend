package keyin.exam.Trees;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TreeService {
    @Autowired
    private TreeRepository treeRepository;



    public List<Tree> findAllTrees() {
        return (List<Tree>) treeRepository.findAll();
    }

    public Tree findTreeById(long id) {
        Optional<Tree> optionalTree = treeRepository.findById(id);

        return optionalTree.orElse(null);
    }

    public Tree createTree(Tree newTree) {
        return treeRepository.save(newTree);
    }

    public Tree updateTree(long id, Tree updatedTree) {

        return null;
    }

    public Tree getTreeByName(String name) {
        return treeRepository.findByName(name);
    }
    public Tree getTreeById(Long id){
        return treeRepository.findById(id).orElse(null);
    }
}
