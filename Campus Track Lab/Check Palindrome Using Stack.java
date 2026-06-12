import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//===== Declare Imports here if required =====


public class Main {

    //===== Declare Global Variables / Functions here if required =====


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        //===== Declare Local Variables / Functions here if required =====


        //===== Write Your Logic Here =====
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            stk.push(s.charAt(i));
        }
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            int temp=stk.pop();
            if(temp!=s.charAt(i)){
                flag=false;
            }
        }
        if(flag==true){
            System.out.print("Palindrome");

        }else{
            System.out.print("Not Palindrome");
        }


        //  System.out.print(stk);


    }
}