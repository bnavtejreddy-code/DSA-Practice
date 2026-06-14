import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//===== Declare Imports here if required =====


public class Main {

    //===== Declare Global Variables / Functions here if required =====


    public static void removeAllElements(Queue<Integer> q) {

        //===== Declare Local Variables / Functions here if required =====


        //===== Write Your Logic Here =====
        while(!q.isEmpty()){
            q.poll();
        }
        


    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        if (n > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                q.add(Integer.parseInt(st.nextToken()));
            }
        }

        removeAllElements(q);

        if (q.isEmpty()) {
            System.out.println("Queue Empty");
        }
    }
}