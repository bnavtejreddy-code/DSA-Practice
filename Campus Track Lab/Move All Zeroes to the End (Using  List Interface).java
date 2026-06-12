import java.util.*;
public class Main{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.substring(1,str.length()-1);
        String[] part=str.split(",");
        int[] arr=new int[part.length];
        for(int i=0;i<part.length;i++){
            arr[i]=Integer.parseInt(part[i].trim());
        }
        int n=arr.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j!=-1){
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        }
        System.out.print("[");
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(arr[n-1]+"]");

    }
}