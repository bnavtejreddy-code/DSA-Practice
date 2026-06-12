import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

//===== Declare Imports here if required =====


public class Main {

    //===== Declare Global Variables / Functions here if required =====


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //===== Declare Local Variables / Functions here if required =====


        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                stack.push(arr[i]);
            }
        }
        if(stack.size()==0){
            System.out.print("Empty Stack");
            return;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
            if(!stack.isEmpty()){
                System.out.print(" ");
            }
        }


        System.out.print(stack.pop());

        //===== Write Your Logic Here =====


    }
}