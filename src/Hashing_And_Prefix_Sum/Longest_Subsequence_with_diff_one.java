package Hashing_And_Prefix_Sum;

import java.util.*;

public class Longest_Subsequence_with_diff_one {
    static void longest_subsequence(int n , int[] a){
        if (n==1){
            System.out.println(1);
            return;
        }
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i =0; i<n; i++){
            hm.put(a[i], hm.getOrDefault(a[i],0)+1);
        }
        int count =1, ans =1;
        for(int i =0; i<n; i++){
            int j = i;
            while(j<n&&hm.containsKey(a[j]+1)){
                j++;
                count++;
            }
            ans = Math.max(ans,count);
            count =1;
        }
        System.out.println(ans);
    };
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        longest_subsequence(n,arr);
    }
}
