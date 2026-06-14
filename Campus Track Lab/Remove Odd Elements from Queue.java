import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

//===== Declare Imports here if required =====


public class Main {

    //===== Declare Global Variables / Functions here if required =====


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        //===== Declare Local Variables / Functions here if required =====


        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        //===== Write Your Logic Here =====
        
        for (int i = 0; i < n; i++){
            int t=queue.poll();
            if(t%2==0){
                queue.offer(t);
            }
            
        }
        if(queue.isEmpty()){
            System.out.print("Empty Queue");
        }
        while(!queue.isEmpty()){
            System.out.print(queue.poll());
            if(!queue.isEmpty()){
                System.out.print(" ");
            }
        }

        
        


    }
}