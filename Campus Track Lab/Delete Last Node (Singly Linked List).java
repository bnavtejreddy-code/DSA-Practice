import java.util.*;

//===== Declare Imports here if required =====


//===== Declare Global Variables / Functions here if required =====


class Node{
    int data;
    Node next;

    Node(int val){
        data = val;
        next = null;
    }
}

public class Main{
    static void printList(Node head) {
        Node temp = head;
        boolean first = true;
        while (temp != null) {
            if (!first) System.out.print(" ");
            System.out.print(temp.data);
            first = false;
            temp = temp.next;
        }
        System.out.println();
    }

    static void solve(int N, Scanner sc){

        //===== Declare Local Variables / Functions here if required =====


        Node head = null;
        Node tail = null;

        for(int i=0;i<N;i++){
            int x = sc.nextInt();
            Node newNode = new Node(x);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

            //===== Write Your Logic Here =====


        }
        
        Node temp=head;
        Node preTemp=head;
        while(temp.next!=null){
            preTemp=temp;
            temp=temp.next;
            
        }
        preTemp.next=null;

        //===== Write Your Logic Here =====
        if(head.next!=null){
        
            printList(head);
        }

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        solve(N, sc);
    }
}