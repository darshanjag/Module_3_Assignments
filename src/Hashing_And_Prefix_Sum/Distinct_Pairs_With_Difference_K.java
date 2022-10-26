package Hashing_And_Prefix_Sum;
import java.util.*;
public class Distinct_Pairs_With_Difference_K {
    static int DistinctPairs(int n, int [] a, int k){
        int count=0;
        HashMap <List<Integer>,Integer> listmap = new HashMap<List<Integer>,Integer>();
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i =0; i<n;i++){
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
            if(hm.get(a[i])==2&& k==0){
                count++;
            }
        }
        if(k==0){
            return count;
        }
        for(int i =0; i<n; i++){

            if(hm.containsKey(a[i]-k)){
                if(!listmap.containsKey(List.of(a[i]-k,a[i]))){
                    listmap.put(List.of(a[i],a[i]-k),1);
                }
            }
            if(hm.containsKey(a[i]+k)){
                if(!listmap.containsKey(List.of(a[i]+k,a[i]))){
                    listmap.put(List.of(a[i],a[i]+k),1);
                }
            }

        }

        return listmap.size();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(DistinctPairs(n,arr,k));
    }
}
