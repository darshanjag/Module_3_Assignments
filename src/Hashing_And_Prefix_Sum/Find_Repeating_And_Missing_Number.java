package Hashing_And_Prefix_Sum;
import java.util.*;
public class Find_Repeating_And_Missing_Number {
    static void repeating_and_missing(int n ,int [] a){
        int [] b = new int[n];

        for(int i =0; i<n; i++){
            b[a[i]-1]++;
        }
        int rep=0; int mis=0;
        for(int i =0; i<n; i++){
            if(b[i]==2){
                rep=i+1;
            }
            if(b[i]==0){
              mis= i+1;

            }

        }
        System.out.println(rep+" "+mis);
    }
    public static void main(String [] args){

       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        repeating_and_missing(n,arr);
    }
}
