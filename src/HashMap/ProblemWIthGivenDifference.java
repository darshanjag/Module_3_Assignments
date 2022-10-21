/*
* Problem With Given Difference
Given an one-dimensional unsorted array A containing N integers.

You are also given an integer B. Find if there exists a pair of elements in the array whose difference is B.

Print 1 if any such pair exists else print 0.

Input Format:
First line contains n (size of the array)

Second line contains n elements of the array

Third line contains integer B.

Output Format:
Print 1 if any such pair exists else print 0.

Example 1
Input

6
5 10 3 2 50 80
78
Output

1
Explanation

Pair (80, 2) gives a difference of 78.

Example 2
Input

2
20 -10
30
Output

1
Explanation

Pair (20, -10) gives a difference of 30 i.e 20 - (-10) => 20 + 10 => 30

Constraints
1 <= N <= 100000

-10000 <= A[i] <= 10000

-20000 <= B <= 20000

*/
package HashMap;
import java.util.*;
public class ProblemWIthGivenDifference {
    static void findDifference(int [] arr, int x){
        boolean found=false;
        HashMap <Integer,Integer>hs = new HashMap<>();
        int [] ans = new int [2];
        for(int i =0; i< arr.length; i++){
            if(hs.containsKey((-arr[i])+x)){
                ans[0]=arr[i]-x;
                ans[1]=arr[i];
                found=true;
            }else{
                hs.put(arr[i],i);
            }
        }
       if(found){
           System.out.println("1");
       }else{
           System.out.println("0");

       }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int x = sc.nextInt();
        findDifference(arr,x);
    }
}
