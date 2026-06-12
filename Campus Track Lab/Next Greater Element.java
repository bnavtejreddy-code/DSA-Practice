import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];//Intialize array
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] res=new int[n];//initailize result array
        for(int i =0;i<n;i++){
            res[i]=-1;
        }
        Stack<Integer> stk=new Stack<>();//logic with stack
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty()){
                if(stk.peek()> arr[i]){
                    res[i]=stk.peek();
                    break;
                }
                else{
                    stk.pop();
                }
            }
            stk.push(arr[i]);
        }
        for(int i=0;i<n-1;i++){
            System.out.print(res[i]+" ");
        }
        System.out.print(res[n-1]);

    }
}