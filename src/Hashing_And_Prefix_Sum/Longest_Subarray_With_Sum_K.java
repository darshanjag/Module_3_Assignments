package Hashing_And_Prefix_Sum;
import java.util.*;
public class Longest_Subarray_With_Sum_K {
    static void longest_subarray(int n , int []a, int k){
        int right =0, left=0, sum =0,ans =0;
            while(right<n){
                sum+= a[right];
                right++;
                while(sum==k){
                    ans = Math.max(ans,right-left);
                    sum-= a[left];
                    left++;
                }
            }
            System.out.println(ans);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        longest_subarray(n,arr,k);
    }
}
