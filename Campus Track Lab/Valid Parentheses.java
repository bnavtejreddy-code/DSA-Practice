import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

//===== Declare Imports here if required =====


public class Main {

    //===== Declare Global Variables / Functions here if required =====


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        //===== Declare Local Variables / Functions here if required =====


        //===== Write Your Logic Here =====
        Stack<Character> stk=new Stack<>();
        boolean flag=true;
        for(int i =0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{'||ch=='['||ch=='('){
                stk.push(ch);
            }else if(ch=='}'||ch==']'||ch==')'){
                if(stk.isEmpty()){
                    flag=false;
                    break;
                }
                char top=stk.peek();
                if((ch==']'&&top=='[')||(ch=='}'&&top=='{')||(ch==')'&&top=='(')){
                    stk.pop();
                }

                else{
                    flag=false;
                    break;
                    
                }

            }else{
                    flag=false;
                    break;
            }
        }
        if(flag && stk.isEmpty()){
            System.out.print("true");
        }else{
            System.out.print("false");

        }


    }
}