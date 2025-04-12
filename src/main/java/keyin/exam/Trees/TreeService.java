package keyin.exam.Trees;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import keyin.exam.BST.BinaryNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeService {
    @Autowired
    private TreeRepository treeRepository;

//methods to return all trees, find the most recent one, and create new ones
    public List<Tree> findAllTrees() {
        return (List<Tree>) treeRepository.findAll();
    }

    public Tree createTree(Tree newTree) throws JsonProcessingException {
        return treeRepository.save(newTree);
    }


    public Tree getRecentTree(){
        return treeRepository.findTopByOrderByIdDesc();
    }

    public Tree getTreeByName(BinaryNode tree) {
        return treeRepository.findByTree(tree);
    }
    public Tree getTreeById(Long id){
        return treeRepository.findById(id).orElse(null);
    }
}
