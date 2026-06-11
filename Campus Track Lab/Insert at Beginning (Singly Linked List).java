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


    static void solve(int N, Scanner sc){

        Node head = null;
        Node tail = null;

        for(int i=0;i<N;i++){
            int x = sc.nextInt();

            //===== Declare Local Variables / Functions here if required =====
            Node newnode=new Node(x);
            if(head==null){
                head=newnode;
            }
            else{
                Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newnode;
            }


            //===== Write Your Logic Here =====


        }

        int X = sc.nextInt();

        //===== Declare Local Variables / Functions here if required =====

        Node newnode=new Node(X);
        //===== Write Your Logic Here =====
        if(head==null){
                head=newnode;
            }
            else{
                newnode.next=head;
                head=newnode;
            }
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }
        System.out.print(temp.data);

            
        


    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        solve(N, sc);
    }
}