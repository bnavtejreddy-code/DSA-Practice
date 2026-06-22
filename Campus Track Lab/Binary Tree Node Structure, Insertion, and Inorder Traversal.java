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


            //===== Write Your Logic Here =====
            if(root==null){
                root=newnode;
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node curr=q.poll();
                if(curr.left==null){
                    curr.left=newnode;
                    return;
                }else{
                    q.add(curr.left);
                }
                if(curr.right==null){
                    curr.right=newnode;
                    return;
                }else{
                    q.add(curr.right);
                }
            }


        }

        public void inorder() {
            //===== Declare Local Variables / Functions here if required =====
            List<Integer> result=new ArrayList<>();


            //===== Write Your Logic Here =====
            if(root==null){
                System.out.print("Tree is empty");
            }

            inorderHelper(root,result);

            StringBuilder sb=new StringBuilder();
            for(int i=0;i<result.size();i++){
                if(i>0) sb.append(" ");
                sb.append(result.get(i));
            }
            System.out.print(sb.toString());

        }

        private void inorderHelper(Node node, List<Integer> result) {
            //===== Declare Local Variables / Functions here if required =====
            if(node==null) return;


            //===== Write Your Logic Here =====
            inorderHelper(node.left,result);
            result.add(node.data);
            inorderHelper(node.right,result);


        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        BinaryTree tree = new BinaryTree();
        while (q-- > 0) {
            String op = sc.next();

            //===== Declare Local Variables / Functions here if required =====


            if (op.equals("INSERT")) {
                int x = sc.nextInt();

                //===== Write Your Logic Here =====
                tree.insert(x);


            } else if (op.equals("INORDER")) {

                //===== Write Your Logic Here =====
                tree.inorder();


            }
        }
    }
}