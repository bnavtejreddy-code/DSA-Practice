import java.util.*;

//===== Declare Imports here if required =====


class Node {
    int data;
    Node left;
    Node right;
    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

public class Main {

    //===== Declare Global Variables / Functions here if required =====


    static class BinaryTree {
        private Node root;

        public BinaryTree() {
            this.root = null;
        }

        public void insert(int val) {
            //===== Declare Local Variables / Functions here if required =====

            Node newnode=new Node(val);


            Queue<Node> queue = new LinkedList<>();
            if (root == null) {
                root = new Node(val);
                return;
            }
            queue.offer(root);

            //===== Write Your Logic Here =====
            while(!queue.isEmpty()){
                Node curr=queue.poll();
                if(curr.left==null){
                    curr.left=newnode;
                    return;
                }else{
                    queue.add(curr.left);
                }
                if(curr.right==null){
                    curr.right=newnode;
                    return;
                }else{
                    queue.add(curr.right);
                }
            }


        }

        private void preorderHelper(Node node, List<Integer> result) {
            //===== Declare Local Variables / Functions here if required =====
            if(node==null) return;


            //===== Write Your Logic Here =====
            result.add(node.data);
            preorderHelper(node.left,result);
            preorderHelper(node.right,result);
            


        }

        private void inorderHelper(Node node, List<Integer> result) {
            //===== Declare Local Variables / Functions here if required =====
            if(node==null) return;


            //===== Write Your Logic Here =====
            inorderHelper(node.left,result);
            result.add(node.data);
            inorderHelper(node.right,result);

        }

        private void postorderHelper(Node node, List<Integer> result) {
            //===== Declare Local Variables / Functions here if required =====
            if(node==null) return;


            //===== Write Your Logic Here =====
            
            
            postorderHelper(node.left,result);
            postorderHelper(node.right,result);
            result.add(node.data);

        }

        public void preorder() {
            //===== Declare Local Variables / Functions here if required =====
            if(root==null){
                System.out.print("Tree is empty");
                return;
            }

            List<Integer> result = new ArrayList<>();

            //===== Write Your Logic Here =====
            preorderHelper(root,result);

            StringBuilder sb=new StringBuilder();
            for(int i=0;i<result.size();i++){
                if(i>0) sb.append(" ");
                sb.append(result.get(i));
            }
            System.out.println(sb.toString());
            


        }

        public void inorder() {
            //===== Declare Local Variables / Functions here if required =====


            if(root==null){
                System.out.print("Tree is empty");
                return;
            }
            List<Integer> result = new ArrayList<>();

            //===== Write Your Logic Here =====
            inorderHelper(root,result);
            
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<result.size();i++){
                if(i>0) sb.append(" ");
                sb.append(result.get(i));
            }
            System.out.println(sb.toString());


        }

        public void postorder() {
            //===== Declare Local Variables / Functions here if required =====


            List<Integer> result = new ArrayList<>();

            //===== Write Your Logic Here =====
            postorderHelper(root,result);

            StringBuilder sb=new StringBuilder();
            for(int i=0;i<result.size();i++){
                if(i>0) sb.append(" ");
                sb.append(result.get(i));
            }
            System.out.println(sb.toString());


        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        BinaryTree tree = new BinaryTree();
        while (q-- > 0) {
            String op = sc.next();
            if (op.equals("INSERT")) {
                int x = sc.nextInt();
                tree.insert(x);
            } else if (op.equals("PREORDER")) {
                tree.preorder();
            } else if (op.equals("INORDER")) {
                tree.inorder();
            } else if (op.equals("POSTORDER")) {
                tree.postorder();
            }
        }
    }
}