import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        LinkedHashMap<Integer,Integer> hash=new LinkedHashMap<>();

        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            if(hash.containsKey(ele)){
                hash.put(ele,hash.get(ele)+1);
            }else{
                hash.put(ele,1);
            }
            
        }
        boolean flag=false;
        for(Map.Entry<Integer,Integer> entry:hash.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey());
                flag=true;
                return;
            }
        }
        if(flag==false){
            System.out.print("-1");
        }
    }
}