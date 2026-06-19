import java.util.LinkedList;
import java.util.Queue;

public class Day9BST {

    // Node of BST
    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert into BST
    public Node insert(int data, Node root) {

        if(root == null) {
            return new Node(data);
        }

        if(data < root.data) {
            root.left = insert(data, root.left);
        } else {
            root.right = insert(data, root.right);
        }

        return root;
    }

    // Search in BST
    public boolean searchKey(Node root, int target) {

        if(root == null) {
            return false;
        }

        if(target < root.data) {
            return searchKey(root.left, target);
        }

        if(target > root.data) {
            return searchKey(root.right, target);
        }

        return true;
    }

    // Inorder Traversal
    public void inOrder(Node root) {

        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Level Order Traversal
    public void levelOrderBfs(Node root) {

        if(root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {

            int size = q.size();

            for(int i = 0; i < size; i++) {

                Node current = q.poll();

                System.out.print(current.data + " ");

                if(current.left != null) {
                    q.offer(current.left);
                }

                if(current.right != null) {
                    q.offer(current.right);
                }
            }

            System.out.println();
        }
    }

    // Delete Node
    public Node deleteNode(Node root, int val) {

        if(root == null) {
            return null;
        }

        if(val < root.data) {
            root.left = deleteNode(root.left, val);
        }

        else if(val > root.data) {
            root.right = deleteNode(root.right, val);
        }

        else {

            // No child
            if(root.left == null && root.right == null) {
                return null;
            }

            // One child
            if(root.left == null) {
                return root.right;
            }

            if(root.right == null) {
                return root.left;
            }

            // Two children
            Node ios = inOrderSuccessor(root.right);

            root.data = ios.data;

            root.right = deleteNode(root.right, ios.data);
        }

        return root;
    }

    // Leftmost node in right subtree
    public Node inOrderSuccessor(Node root) {

        while(root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void main(String[] args) {

        Day9BST bst = new Day9BST();

        Node root = null;

        root = bst.insert(20, root);
        root = bst.insert(16, root);
        root = bst.insert(10, root);
        root = bst.insert(23, root);
        root = bst.insert(54, root);

        System.out.print("Inorder: ");
        bst.inOrder(root);

        System.out.println("\n");

        System.out.println(
            bst.searchKey(root, 23)
            ? "Target Found"
            : "Target Not Found"
        );

        System.out.println("\nLevel Order:");

        bst.levelOrderBfs(root);

        System.out.println("\nDeleting 23");

        root = bst.deleteNode(root, 23);

        System.out.print("Inorder After Deletion: ");
        bst.inOrder(root);
    }
}