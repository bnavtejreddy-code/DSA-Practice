import java.util.*;

//===== Declare Imports here if required =====


public class Main {

    static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    //===== Declare Global Variables / Functions here if required =====


    static void solve(int N, Scanner sc) {
        Node head = null;
        Node tail = null;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();

            //===== Declare Local Variables / Functions here if required =====


            //===== Write Your Logic Here =====
            Node newnode=new Node(x);
            if(head==null){
                head=newnode;
            }else{
                Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newnode;
            }


        }

        //===== Write Your Logic Here =====
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }
        System.out.print(temp.data);



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        solve(N, sc);
    }
}