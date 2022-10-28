package Prefix_And_Sliding_Window;
import java.util.*;
public class Largest_Subarray_Sum_0 {
    static int largest_subarray(int n , int [] a){
        Map<Integer,Integer>map=new HashMap<>();
        int maxi = 0;
        int sum =0;

        for (int i = 0; i<a.length; i++){
            sum+=a[i];
            if (sum==0){
                maxi= i+1;

            }
            else {
                if (map.containsKey(sum)){
                    maxi= Math.max(maxi, i- map.get(sum));

                }
                else {
                    map.put(sum,i);
                }
            }

        }

        return maxi;
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
