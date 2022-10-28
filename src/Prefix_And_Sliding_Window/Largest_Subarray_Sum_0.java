package Prefix_And_Sliding_Window;
import java.util.*;
public class Largest_Subarray_Sum_0 {
    static int largest_subarray(int n , int [] a){
        Map<Integer,Integer>map=new HashMap<>();
        int max = 0;
        int sum =0;
        for(int i =0; i<n ; i++){
            sum += a[i];
            if(sum==0){
                max= i+1;
            }else{
                if(map.containsKey(sum)){
                    max= Math.max(max,i-map.get(sum));
                }else{
                    map.put(sum,i);
                }
            }

        }
        return max;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(largest_subarray(n,arr));
    }
}
