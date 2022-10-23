package Sliding_Window;
/*
* Smaller Than Triplet Sum
You are given an array ARR containing N integers, and you are also given an integer TARGET. You task is to find the count of triplets i, j, k ( 0 ≤ i < j < k < N ), such that ARR[i] + ARR[j] + ARR[j] is less than the value of TARGET.

For example:

If N = 7, ARR = { 1, 5, 2, 3, 4, 6, 7 } and TARGET = 9 Then, there are three triplets with sum less than 9:

{1, 5, 2}
{1, 2, 3}
{1, 2, 4}
{1, 3, 4} Thus, the output will be 4.
Input Format:
The first line contains a single integer N, denoting the size of the array.

The second line of contains N integers of the array ARR, denoting the array elements.

The third line contains a single integer TARGET, denoting the target value to evaluate the smaller sum.

Output Format:
Print the count of triplets having a sum less than the given target value.

Example 1:
Input:*/
import java.util.Arrays;
import java.util.Scanner;

class Triplet_Sum_Less_Than_K
{

    static int countTriplets(int n, int sum, int[] arr)
    {
        Arrays.sort(arr);
        int ans = 0;

        for (int i = 0; i < n - 2; i++)
        {
            int j = i + 1, k = n - 1;
            while (j < k)
            {
                if (arr[i] + arr[j] + arr[k] >= sum)
                    k--;
                else
                {
                    ans += (k - j);
                    j++;
                }
            }
        }
        return ans;
    }

    // driver method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int [n];
        for(int i =0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(countTriplets(n, x, nums));
    }
}
