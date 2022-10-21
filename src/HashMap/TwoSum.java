package HashMap;
import java.util.*;
public class TwoSum {
    static void twoSum(int [] arr, int target) {
        int [] ans = new int[2];
        HashMap<Integer,Integer>map = new HashMap<>();
        int n = arr.length;

        for(int i =0; i<n; i++){
            if(map.containsKey(target-arr[i])){
                ans[0]=i;
                ans[1]= map.get(target-arr[i]);

            }else{
                map.put(arr[i],i);
            }
        }
        System.out.print(ans[0]+" "+ans[1]);
    }
   public static void main(String [] args){

       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int [] arr = new int[n];
       for(int i=0; i<n; i++){
           arr[i]= sc.nextInt();
       }
       int x = sc.nextInt();
       twoSum(arr,x);
   }
}
