package keyin.exam.Trees;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import keyin.exam.BST.BinaryNode;
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

    public Tree createTree(Tree newTree) throws JsonProcessingException {

//        Tree BST = new Tree(newTree);

        return treeRepository.save(newTree);
    }


    public Tree getRecentTree(){
        return treeRepository.findTopByOrderByIdDesc();
    }

    public Tree getTreeByName(String tree) {
        return treeRepository.findByTree(tree);
    }
    public Tree getTreeById(Long id){
        return treeRepository.findById(id).orElse(null);
    }
}
