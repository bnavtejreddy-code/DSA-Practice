import java.util.*;

//===== Declare Imports here if required =====


class Node{
    int data;
    Node prev;
    Node next;

    Node(int val){
        data = val;
        prev = null;
        next = null;
    }
}

public class Main{

    //===== Declare Global Variables / Functions here if required =====
    static void printall(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print(" ");
            }
            temp=temp.next;
        }
        
    }


    static void solve(int N, Scanner sc){

        Node head = null;
        Node tail = null;

        for(int i=0;i<N;i++){
            int x = sc.nextInt();

            //===== Declare Local Variables / Functions here if required =====


            //===== Write Your Logic Here =====
            
            Node newnode=new Node(x);

            //===== Write Your Logic Here =====
            if(head==null){
                head=newnode;
                tail=newnode;
            }else{
                tail.next=newnode;
                newnode.prev=tail;
                tail=newnode;
            }


        }



        

        //===== Write Your Logic Here =====
        int pos=sc.nextInt();
        Node temp=head;
        for(int i =1;i<pos-1;i++){
            temp=temp.next;
        }
        if(pos==1){
            head=head.next;
            printall(head);
            return;
        }
        Node next=temp.next;
        temp.next=next.next;
        if(next.next!=null){
            next.next.prev=temp;
        }
        printall(head);

    }
    

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        solve(N, sc);
    }
}