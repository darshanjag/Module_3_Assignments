package HashMap;
import java.util.*;
public class Find_The_First_Non_Repeating_Character {
    static void find_non_repeating_char(String s){
        HashMap <Character,Integer> hm = new HashMap<>();

        int n = s.length();
        char ans=')';
        for(int i=n-1; i>=0; i--){
            char c = s.charAt(i);

            if(hm.containsKey(c)){
                hm.put(c,hm.getOrDefault(c,0)+1);

            }else{
                hm.put(c,1);

            }
        }
        for(int i =0; i<n; i++){
            if(hm.get(s.charAt(i))==1) {
                System.out.println(s.charAt(i));
                return;
            }
        }
        System.out.println(-1);


    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();


        find_non_repeating_char(s);
    }
}
