package Prefix_And_Sliding_Window;
import java.util.*;
import java.lang.*;
import java.io.*;




public class Find_Hinged_Element {
    static int findElement(int[] arr, int n) {
        // Write your code here
        int left[]= new int[n];
        left[0]=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            left[i]=Math.max(arr[i-1],left[i-1]);
        }
        System.out.println(Arrays.toString(left));
        int right=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            if(left[i]<arr[i] && arr[i]<right){
                return i;
            }
            right=Math.min(right,arr[i]);
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }


        System.out.println(findElement(nums, n));
    }
}