package HashMap;
import java.util.*;
public class Subarrays_With_Distinct_Integers {
    private static int exactlyK(int nums[], int n, int k)
    {
        HashMap <Integer,Integer> hs = new HashMap<>();
      int right=0,left=0,count =0,prefix=0,distinctNumber=0;
      // sliding window problem


      while (right<nums.length){
          // if hashmap does not contain the right boundry element or
          //element has frequency zero, increase the distinct number size.
          if(!hs.containsKey(nums[right])|| hs.get(nums[right])==0){
              distinctNumber++;
          }
          hs.put(nums[right],hs.getOrDefault(nums[right],0)+1);
          // every time we iterate to a new variable, add it to hashmap,
          // raise its frequency by one

          //if distinct number has become greater than K then
          //reduce the frequency of left boundy elelment. increment left.
          //distinct number decrement and set prefix to zero.
          if(distinctNumber>k){
              int leftElement = nums[left];
              hs.put(leftElement,hs.getOrDefault(leftElement,0)-1);
              prefix=0;
              left++;
              distinctNumber--;
          }
          // now if left boundry element has frequency more than one
          //add prefix and increae left boundry. so as to count extra subarray
          while(hs.get(nums[left])>1){
              int startNum = nums[left++];
              hs.put(startNum, hs.get(startNum) - 1);
              prefix++;

          }
          // adding prefix to the result plus current element.
          if(distinctNumber==k){
              count+= prefix+1;
          }

          right++;
      }
      return count;
    }

    // Function to return the count of subnumsays
    // with exactly K distinct elements


    // Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int [n];
        for(int i =0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int x = sc.nextInt();

        System.out.print(exactlyK(nums, n, x));
    }
}
