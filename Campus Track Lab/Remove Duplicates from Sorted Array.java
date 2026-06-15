import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println(i+1);
        for(int j=0;j<i;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.print(arr[i]);

    }
}