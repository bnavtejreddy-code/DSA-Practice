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

        //===== Declare Local Variables / Functions here if required =====


        Node head = null;
        Node tail = null;
        

        for(int i=0;i<N;i++){
            int x = sc.nextInt();
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
        int X = sc.nextInt();
        int position = sc.nextInt();


        //===== Write Your Logic Here =====
        Node newnode=new Node(X);

        if(position==1){
            newnode.next=head;
            
            if(head!=null){
                head.prev=newnode;
            }
            head=newnode;
            printall(head);
            return;
        }
        Node temp=head;
        for(int i =1;i<position-1;i++){
            temp=temp.next;
        }
        Node next=temp.next;

        temp.next=newnode;
        newnode.prev=temp;
        newnode.next=next;
        if(next!=null){
            next.prev=newnode;
        }
        printall(head);



    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        solve(N, sc);
    }
}