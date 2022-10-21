package HashMap;
import java.util.*;
class Find_Anagrams{
    public static void find(String s, String p){
        int [] charCount = new int [26]; // array to represent all alphabets

        //setting the frequency of each character in p in charCount
        for(int i =0; i<p.length(); i++){
            charCount[p.charAt(i)-'a']++;
        }
        // left and right to represent the boundry of the window
        // toVisit to represent number of characters we need for window.
        int left=0, right=0, toVisit=p.length();
        while(right<s.length()){
            //we check if the right boundry character is present in the frequency table.
            if(charCount[s.charAt(right)-'a']>=1){
                toVisit--; // reduce the toVisit, to indicate we found a required character.
            }
            charCount[s.charAt(right)-'a']--; // we reduce the frequency of right boundry character.\
            right++;

            // now we check if we have found all the characters required.
            if(toVisit==0){
                System.out.print(left+" ");
            }
            if(right-left==p.length()){// window reached full size

                if(charCount[s.charAt(left)-'a']>=0){
                    toVisit++;
                }
                charCount[s.charAt(left)-'a']++;
                left++;
            }

        }

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int m = sc.nextInt();
        String p = sc.next();

        find(s,p);
    }
}