package HashMap;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Check_Premutation_Palindrome
{
    static void is_palindrome(String s){
        int n =s.length();
        boolean ans= true;
        int even=0;
        int odd=0;
        HashMap<Character, Integer>hs = new HashMap<>();

        for(int i =0; i<n; i++){
            char c = s.charAt(i);



            if(hs.containsKey(c)){
                hs.put(c,hs.getOrDefault(c,0)+1);
                if(hs.get(c)%2==0){
                    odd--;
                }
            }else{
                hs.put(c,1);
                odd++;
            }

        }
        if(odd>1){
            ans=false;
        }
        if(ans){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            String s = sc.next();
            is_palindrome(s);
            t--;
        }


    }
}




