package Sliding_Window;
import java.util.*;
public class Maximum_Ones_After_Modification {

    static int longestOnes(int[] A, int B) {
        int si=0,ei=0, max=0,  n = A.length;
        while(ei<n){
            if(A[ei]==0){
                B--;
            }
            while(B<0){
                if(A[si]==0){
                    B++;
                }
                si++;
            }
            ei++;

            max = Math.max(max,ei-si);
        }
        return max;
    }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int i=0;i<N;i++)
                A[i] = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(longestOnes(A, B));
        }
}
