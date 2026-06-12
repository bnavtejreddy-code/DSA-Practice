import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//===== Declare Imports here if required =====


public class Main {

    //===== Declare Global Variables / Functions here if required =====
    public static void reverse(int arr[],int start,int stop){
        while(start<stop){
            int temp=arr[start];
            arr[start]=arr[stop];
            arr[stop]=temp;
            start++;
            stop--;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        int D = Integer.parseInt(br.readLine());

        //===== Declare Local Variables / Functions here if required =====


        //===== Write Your Logic Here =====
        String[] str=line1.split(",");
        int[] arr=new int[str.length];
        for(int i=0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        if(D>str.length){
            D=D%str.length;
        }
        
        reverse(arr,0,D-1);
        reverse(arr,D,str.length-1);
        reverse(arr,0,str.length-1);

        System.out.print("[");
        for(int i=0;i<str.length-1;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(arr[str.length-1]+"]");


    }
}