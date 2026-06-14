import java.util.*;
public class Main{
    static Queue<Integer> queue1=new LinkedList<>();
    static Queue<Integer> queue2=new LinkedList<>();
    static void push(int x){
        queue2.offer(x);

        while(!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        

        Queue<Integer> temp = queue1;
        queue1=queue2;
        queue2=temp;
    }
    static int pop(){
        if(isEmpty()){
            return -1;
        }
        return queue1.poll();
    }
    static int top(){
        if(isEmpty()){
            return -1;
        }
        return queue1.peek();
    }
    static boolean isEmpty(){
        
        return queue1.isEmpty()&&queue2.isEmpty();
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            String op=sc.next();
            if(op.equals("push")){
                int x = sc.nextInt();
                push(x);
            }else if(op.equals("top")){
                System.out.println(top());
            }else if(op.equals("pop")){
                System.out.println(pop());
            }else if(op.equals("isEmpty")){
                System.out.println(isEmpty());
            }
        }
    }
}