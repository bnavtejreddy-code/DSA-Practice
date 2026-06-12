import java.util.*;

// =====================================================
// STACK IMPLEMENTATION USING ARRAY
// =====================================================

class StackUsingArray {

    int[] arr;
    int top = -1;

    public StackUsingArray(int size) {
        arr = new int[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }

        return arr[top];
    }
}

// =====================================================
// STACK IMPLEMENTATION USING ARRAYLIST
// =====================================================

class StackUsingArrayList {

    ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(int data) {
        list.add(data);
    }

    public int pop() {

        if (isEmpty()) {
            return -1;
        }

        return list.remove(list.size() - 1);
    }

    public int peek() {

        if (isEmpty()) {
            return -1;
        }

        return list.get(list.size() - 1);
    }
}



public class Day4Stacks {

    public static void main(String[] args) {

    System.out.println("Stack Using Array:");

    StackUsingArray stk1 = new StackUsingArray(5);

    stk1.push(10);
    stk1.push(20);
    stk1.push(30);

    System.out.println("Peek: " + stk1.peek());

    while(!stk1.isEmpty()){
        System.out.println(stk1.pop());
    }

    System.out.println("Stack Using ArrayList:");

    StackUsingArrayList stk2 = new StackUsingArrayList();

    stk2.push(100);
    stk2.push(200);
    stk2.push(300);

    System.out.println("Peek: " + stk2.peek());

    while(!stk2.isEmpty()){
        System.out.println(stk2.pop());
    }
}
}

/*

VALID PARENTHESES
=====================================================

public static boolean validParentheses(String s){

    Stack<Character> stk = new Stack<>();

    Map<Character, Character> map = new HashMap<>();

    map.put(')', '(');
    map.put('}', '{');
    map.put(']', '[');

    for(char ch : s.toCharArray()){

        if(ch == '(' || ch == '{' || ch == '['){
            stk.push(ch);
        }
        else{

            if(stk.isEmpty()){
                return false;
            }

            if(stk.peek() == map.get(ch)){
                stk.pop();
            }
            else{
                return false;
            }
        }
    }

    return stk.isEmpty();
}

NEXT GREATER ELEMENT
=====================================================

public static int[] nextGreaterElement(int[] arr){

    int n = arr.length;

    int[] res = new int[n];

    Arrays.fill(res, -1);

    Stack<Integer> stk = new Stack<>();

    for(int i = n - 1; i >= 0; i--){

        while(!stk.isEmpty() &&
              stk.peek() <= arr[i]){
            stk.pop();
        }

        if(!stk.isEmpty()){
            res[i] = stk.peek();
        }

        stk.push(arr[i]);
    }

    return res;
}

Example:

Input:
4 5 2 10 8

Output:
5 10 10 -1 -1

*/