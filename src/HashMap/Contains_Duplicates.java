package HashMap;
import java.util.*;
public class Contains_Duplicates {
    static void containsDuplicate(int [] arr, int n ){
        String ans= "false";
        HashSet <Integer> hs = new HashSet<>();
        for(int i =0; i<n; i++){
            int num = arr[i];
            if(hs.contains(arr[i])){
                ans="true";
            }else{
                hs.add(arr[i]);
            }
        }
        System.out.println(ans);
    }
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        containsDuplicate(arr,n);
    }
}
