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

    //===== Declare Global Variables / Functions here if required =====
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

        Node head = null;
        Node tail = null;

        //===== Declare Local Variables / Functions here if required =====


        

            //===== Write Your Logic Here =====
            for (int i = 0; i < N; i++) {
            int x = sc.nextInt();

            Node newNode = new Node(x);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        if(head!=null){
            head=head.next;
        }

        
        

    printList(head);

    }
    

   
    



    

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        solve(N, sc);
    }
}