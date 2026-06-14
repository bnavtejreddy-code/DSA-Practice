import java.util.*;
public class Main{
    static Stack<Integer> stack1=new Stack<>();
    static Stack<Integer> stack2=new Stack<>();
    static void enqueue(int data){
        stack1.push(data);
    }
    static int dequeue(){
        if(isEmpty()){
            return -1;
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    static int peek(){
        if(isEmpty()){
            return -1;
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    static boolean isEmpty(){
        return stack1.isEmpty()&&stack2.isEmpty();
}

    
    
    
    
    
    
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            String op = sc.next();
            if(op.equals("enqueue")){
                int x = sc.nextInt();
                enqueue(x);
            }else if(op.equals("peek")){
                System.out.println(peek());
            }else if(op.equals("dequeue")){
                System.out.println(dequeue());
            }else if(op.equals("isEmpty")){
                System.out.println(isEmpty());
            }
        }
    }
}