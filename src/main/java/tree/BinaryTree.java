package tree;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {
    public static List<Integer> inorderTraversal(Node root) {
        List<Integer> result = new LinkedList<>();
        //inorderHelper(root, result);
        result = inorderTraversalByStack(root);
        return result;
    }

    // 中序遍历
    private static void inorderHelper(Node root, List<Integer> result) {
        if (root== null) {
            return;
        }
        inorderHelper(root.getLeftNode(), result);
        result.add(root.getData());
        inorderHelper(root.getRightNode(), result);
    }

    public static List<Integer> inorderTraversalByStack(Node root) {
        List<Integer> result = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while (cur != null||!stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.getLeftNode();
            } else {
                cur = stack.pop();
                result.add(cur.getData());
                cur = cur.getRightNode();
            }
        }
        return result;
    }

    public static void main(String[] args){
        Node a = new Node(2,null,null);
        Node b = new Node(8,null,null);
        Node root = new Node(5,a,b);
        List<Integer> list  = firstOrderTraversalByStack(root);
        System.out.println(list);
    }

    public static List<Integer> firstOrderTraversalByStack(Node root) {
        List<Integer> result = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        stack.push(cur);
        while (!stack.isEmpty()){
            root = stack.pop();
            result.add(root.getData());
            if(root.getRightNode()!=null){
                stack.push(root.getRightNode());
            }
            if(root.getLeftNode()!=null){
                stack.push(root.getLeftNode());
            }

        }
        return result;
    }
}
