package keyin.exam.Trees;

import keyin.exam.BST.BinarySearchTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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


//    @PostMapping(value = "/trees", consumes = {MediaType.APPLICATION_JSON_VALUE, "application/json;charset=UTF-8"})
//    public Tree createTree(@RequestBody Tree newTree) {
//        return treeService.createTree(newTree);
//    }
    @PostMapping("/trees/process-numbers")
    public Tree createTreeWithArray(@RequestParam List<Integer> values){
        BinarySearchTree bst = new BinarySearchTree();
        for(int i = 0; i<values.size() ; i++){
            bst.insert()
        }
    }

}
