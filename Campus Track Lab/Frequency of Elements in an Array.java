import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        TreeMap<Integer,Integer> hash=new TreeMap<>();
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            hash.put(ele,hash.getOrDefault(ele,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        } 
    }
}