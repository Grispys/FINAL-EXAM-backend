package keyin.exam.Trees;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import keyin.exam.BST.BinaryNode;
import keyin.exam.BST.BinarySearchTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class TreeController {
    @Autowired
    private TreeService treeService;

    @GetMapping("/trees/previous-trees")
    public List<Tree> getAllTrees() throws JsonProcessingException{
       return treeService.findAllTrees();
    }



    @GetMapping("/trees/most-recent")
    public BinaryNode getRecentTrees() throws JsonProcessingException {
        return treeService.getRecentTree().getName();
    }



    @PostMapping("/trees/process-numbers")
    public Tree createTreeWithArray(@RequestBody List<Integer> values) throws JsonProcessingException {
        BinarySearchTree bst = new BinarySearchTree();
        for(int i = 0; i< values.size() ; i++){
            bst.insert(values.get(i));
        }
        BinaryNode trueBST = bst.root;

        Tree binaryTree = new Tree(trueBST);
        return treeService.createTree(binaryTree);
    }

}
