import java.util.*;
public class Main{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int[] arr1=new int[n1];
    for(int i =0;i<n1;i++){
        arr1[i]=sc.nextInt();
    }
    int n2=sc.nextInt();
    int[] arr2=new int[n2];
    for(int i =0;i<n2;i++){
        arr2[i]=sc.nextInt();
    }
    int i=0;int j=0;
    int[] res=new int[arr1.length+arr2.length];
    int resIndex=0;
    while(i<arr1.length && j<arr2.length){
        if(arr1[i]<arr2[j]){
            res[resIndex]=arr1[i];
            resIndex++;
            i++;
        }else{
            res[resIndex]=arr2[j];
            resIndex++;
            j++;
        }
    }
    while(i<arr1.length){
        res[resIndex]=arr1[i];
            resIndex++;
            i++;
    }
    while(j<arr2.length){
        res[resIndex]=arr2[j];
            resIndex++;
            j++;
    }
    for(int n =0;n<(arr1.length+arr2.length)-1;n++){
        System.out.print(res[n] +" ");
    }
    System.out.print(res[arr1.length+arr2.length-1]);


    }
}