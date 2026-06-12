import java.util.*;
public class Main{
    public static int RectangleHist(int[] arr){
        int n = arr.length;
        int maxarea=0;
        Stack<Integer> stk=new Stack<>();
        for(int i =0;i<=n;i++){
            int currheight;
            if(i==n){
                currheight=0;
            }else{
                currheight=arr[i];
            }
            while(!stk.isEmpty() && currheight<arr[stk.peek()]){
                int h = arr[stk.pop()];
                int w;
                if(stk.isEmpty()){
                    w=i;
                }else{
                    w=i-stk.peek()-1;
                }int area=h*w;
                if(area>maxarea){
                    maxarea=area;
                }
            }
            stk.push(i);
        }
        return maxarea;


    }
    
    
    
    
    
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(RectangleHist(arr));
    }
}