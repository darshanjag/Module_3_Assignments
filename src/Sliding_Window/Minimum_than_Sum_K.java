package Sliding_Window;
import java.util.*;
public class Minimum_than_Sum_K {
    static int findMinSub(int []a, int k){
        if (a == null || a.length == 0)
            return 0;

        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

        while (j < a.length) {
            sum += a[j++];

            while (sum >= k) {
                min = Math.min(min, j - i);
                sum -= a[i++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int [] arr = new int[n];
    for(int i =0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(findMinSub(arr,k));
    }
}
