package Sliding_Window;
import java.util.*;
/*
* Priyank and Toys
Priyanka works for an international toy company that ships by container.
*  Her task is to the determine the lowest cost way to combine her orders
*  for shipping. She has a list of item weights. The shipping company has
* a requirement that all items loaded in a container must weigh less than
* or equal to 4 units plus the weight of the minimum weight item.
*  All items meeting that requirement will be shipped in one container.

What is the smallest number of containers that can be contracted to
* ship the items based on the given list of weights?

For example: There are items with weights w=[1,2,3,4,5,10,11,12,13] .

This can be broken into two containers:[1,2,3,4,5] and [10,11,12,13] .

Each container will contain items weighing within 4 units of the minimum weight item.

Function Description

Complete the function Containers in the editor below. It should print the
*  minimum number of containers required to ship.

Containers has the following parameter(s):

w: an array of integers that represent the weights of each order to ship
Input Format
The first line contains an integer n , the number of orders to ship.

The next line contains n space-separated integers,w[1],w[2],....,w[n] ,
* representing the orders in a weight array.

Output Format:
Return the integer value of the number of containers Priyanka must
*  contract to ship all of the toys.

Example 1:
Input:

8
1 2 3 21 7 12 14 21
Output:

4
Explanation:

The first container holds items weighing 1,2 and 3 . (weights in range 1....5 )

The second container holds the items weighing 21 units. (21.......25)

The third container holds the item weighing 7 units. (7....11)

The fourth container holds the items weighing 12 and 14 units. (12........14)

Total: 4 containers are required.

Example 2:
Input:

9
1 2 3 4 5 10 11 12 13
Output:

2
Explanation:

The first container holds items weighing 1, 2, 3, 4, 5 units each

The second container holds the items weighing 10, 11, 12, 13 units each

Total: 2 containers are required.

Constraints:
1<=n<=10^5

0<=w[i]<=10^4 where i belongs to [1,n]*/
public class Priyanka_And_Toys {
    static void numberOfContainers(int n, int [] a){
        Arrays.sort(a);
        int right= 0;
        int count =1;
        int x = a[0]+4;
        for(int i=0;i<n;i++){
            if(!(a[i]<=x))
            {
                count++;
                x=a[i]+4;

            }
        }
        System.out.println(count);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        numberOfContainers(n,arr);
    }
}
