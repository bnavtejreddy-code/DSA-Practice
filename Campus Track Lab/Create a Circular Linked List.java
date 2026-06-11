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
    public static void printall(Node head,Node tail){
        Node temp=head;
        while(temp!=tail){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data);

    }

    //===== Declare Global Variables / Functions here if required =====


    static void solve(int N, Scanner sc){

        Node head = null;
        Node tail = null;

        for(int i=0;i<N;i++){
            int x = sc.nextInt();

            //===== Declare Local Variables / Functions here if required =====


            //===== Write Your Logic Here =====
            Node newnode=new Node(x);
            if(head==null){
                head=newnode;
                tail=newnode;
                tail.next=head;
            }else{
                tail.next=newnode;
                tail=newnode;
                tail.next=head;
            }


        }

        //===== Write Your Logic Here =====
        printall(head,tail);


    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        solve(N, sc);
    }
}