package HashMap;
import java.util.*;
import java.util.Map.*;
public class Frequency_Count {
    static void freq(String [] arr, int n){
        String ans = "";

        Map<String, Integer> mp = new HashMap<>();

        for(int i=n-1; i >= 0; i--){
            String s = arr[i];
            mp.put(s, mp.getOrDefault(s, 0) + 1);
            if(mp.get(s) > mp.getOrDefault(ans, 0)){
                ans = s;
            }
        }

      System.out.println(ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



        String [] arr = new String[n];
        for(int i =0;i<n; i++){
            arr[i]=sc.next();
        }

        freq(arr,n);

    }
}
