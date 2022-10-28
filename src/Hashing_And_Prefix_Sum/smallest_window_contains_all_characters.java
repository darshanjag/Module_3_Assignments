package Hashing_And_Prefix_Sum;
import java.util.*;
public class smallest_window_contains_all_characters {
    static String smallest_window(String s, String t) {
        // corner case
        if(s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) return "";
        int minright =0;
        int minleft= 0;
        int count=0;
        int min = s.length()+1;
        boolean flag = false;

        HashMap <Character,Integer> hm = new HashMap<>();
        for(char c : t.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int i=0,j =0;
        while(i<s.length()){
            char c = s.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.getOrDefault(c,0)-1);
                if(hm.get(c)>=0){
                    count++;
                }
            }
            if(count==t.length()){
                flag=true;
                int curLen = i+1 -j;
                if(curLen<=min){
                    minleft= j;
                    minright=i;
                    min =curLen;
                }
            }
            while(count==t.length()){

                // shrink
                char left = s.charAt(j);
                if(hm.containsKey(left)){
                    hm.put(left, hm.getOrDefault(left,0)+1);
                    if(hm.get(left)>=1){
                        count--;
                    }
                }
                j++;
            }


            i++;

        }
        return flag ? s.substring(minleft,minright+1): "";
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(smallest_window(s,t));

    }
}
