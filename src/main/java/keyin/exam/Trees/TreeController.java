package keyin.exam.Trees;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
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

    @GetMapping("/trees")
    public List<Tree> getAllTrees() {

        return treeService.findAllTrees();
    }



    @GetMapping("/trees/most-recent")
    public JsonNode getRecentTrees() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String stringToParse = treeService.getRecentTree().getName();
        return objectMapper.readTree(stringToParse);
    }



    @PostMapping("/trees/process-numbers")
    public Tree createTreeWithArray(@RequestBody List<Integer> values) throws JsonProcessingException {
        BinarySearchTree bst = new BinarySearchTree();
        for(int i = 0; i< values.size() ; i++){
            bst.insert(values.get(i));
        }

        ObjectMapper objectMapper = new ObjectMapper();
        String treeJson = objectMapper.writeValueAsString(bst.root);
        Tree binaryTree = new Tree(treeJson);
        return treeService.createTree(binaryTree);
    }

}
