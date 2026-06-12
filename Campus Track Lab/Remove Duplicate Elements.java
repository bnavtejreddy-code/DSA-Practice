import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedHashSet;
import java.util.Set;

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


        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for(int i:arr){
            if(!uniqueElements.contains(i)){
                uniqueElements.add(i);
            }
        }
        int count=0;
        for(int i :uniqueElements){
        System.out.print(i);
        if(count!=uniqueElements.size()-1){
            System.out.print(" ");
        }
        count++;
        }


        //===== Write Your Logic Here =====


    }
}