import java.util.*;

//===== Declare Imports here if required =====


class Node{
    int data;
    Node next;

    Node(int val){
        data = val;
        next = null;
    }
}

public class Main{

    


    static void solve(int N, Scanner sc){

        Node head = null;
        Node tail = null;

        //===== Declare Local Variables / Functions here if required =====


        

            //===== Write Your Logic Here =====
            ArrayList<Node> nodes=new ArrayList<>();
            for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            


            Node newNode = new Node(x);
            nodes.add(newNode);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        int pos = sc.nextInt();
        if(pos!=-1){
            tail.next=nodes.get(pos);
        }
        
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                System.out.print("true");
                return;
            }
        }
        System.out.print("false");


    }
    

   
    



    

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        solve(N, sc);
    }
}