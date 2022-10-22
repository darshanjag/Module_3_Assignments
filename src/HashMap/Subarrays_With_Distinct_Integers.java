package HashMap;
import java.util.*;
public class Subarrays_With_Distinct_Integers {
    private static int exactlyK(int nums[], int n, int k)
    {
        HashMap <Integer,Integer> hs = new HashMap<>();
      int right=0,left=0,count =0,prefix=0,distinctNumber=0;

      while (right<nums.length){
          if(!hs.containsKey(nums[right])|| hs.get(nums[right])==0){
              distinctNumber++;
          }
          hs.put(nums[right],hs.getOrDefault(nums[right],0)+1);

          if(distinctNumber>k){
              int leftElement = nums[left];
              hs.put(leftElement,hs.getOrDefault(leftElement,0)-1);
              prefix=0;
              left++;
              distinctNumber--;
          }
          while(hs.get(nums[left])>1){
              int startNum = nums[left++];
              hs.put(startNum, hs.get(startNum) - 1);
              prefix++;

          }
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
