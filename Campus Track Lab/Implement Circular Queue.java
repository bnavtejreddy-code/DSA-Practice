import java.util.*;
public class Main{
    static int[] arr;
    static int frontidx;
    static int rearidx;
    static int size;
    static int capacity;

    static void init(int cap){
        capacity=cap;
        arr =new int[capacity];
        frontidx=0;
        rearidx=-1;
        size=0;
    }

    static boolean enqueue(int val){
        if(isFull()){
            return false;
        }
        rearidx=(rearidx+1)%capacity;
        arr[rearidx]=val;
        size++;
        return true;
    }

static boolean dequeue(){
    if(isEmpty()){
        return false;
    }
    frontidx=(frontidx+1)%capacity;
    size--;
    return true;
}

static int front(){
    if(isEmpty()){
        return -1;
    }
    return arr[frontidx];
}
static int rear(){
    if(isEmpty()){
        return -1;
    }
    return arr[rearidx];
}
static boolean isEmpty(){
    return size==0;
}
static boolean isFull(){
    return size==capacity;
}
    
    
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int cap = sc.nextInt();
        int n = sc.nextInt();
        init(cap);
        while(n-->0){
            String s = sc.next();
            if(s.equals("enqueue")){
                int x = sc.nextInt();
                System.out.println(enqueue(x));
            }else if(s.equals("rear")){
                System.out.println(rear());
            }else if(s.equals("front")){
                System.out.println(front());
            }else if(s.equals("isFull")){
                System.out.println(isFull());
            }else if(s.equals("dequeue")){
                System.out.println(dequeue());
            }else if(s.equals("isEmpty")){
                System.out.println(isEmpty());
            }
        }
    }
}