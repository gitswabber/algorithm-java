package codility;

public class Solution {

    public int solution(int A, int B, int N) {
        int modNumber = 1000000007;
        if(N == 0) return A % modNumber;
        if(N == 1) return B % modNumber;

        int[] gf = new int[3];
        gf[0] = A;
        gf[1] = B;

        for(int i=2; i<=N; i++) {
            gf[2] = (gf[0] + gf[1]) % modNumber;
            gf[0] = gf[1];
            gf[1] = gf[2];
        }
        return gf[2];
    }

/*    public int GF(int A, int B, int N) {
        if(N == 0) {
            return A;
        } else if(N == 1) {
            return B;
        }
        return GF(A, B, N-1) + GF(A, B, N-2);
    }*/

/*    public int GF(int A, int B, int N) {
        int modNumber = 1000000007;
        if(N == 0) return A % modNumber;
        if(N == 1) return B % modNumber;

        int[] gf = new int[3];
        gf[0] = A;
        gf[1] = B;

        for(int i=2; i<=N; i++) {
            gf[2] = (gf[0] + gf[1]) % modNumber;
            gf[0] = gf[1];
            gf[1] = gf[2];
        }
        return gf[2];
    }*/


    // main
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.solution(3, 4, 0));
//        System.out.println(solution.solution(3, 4, 1));
//        System.out.println(solution.solution(3, 4, 2));
//        System.out.println(solution.solution(3, 4, 3));
//        System.out.println(solution.solution(3, 4, 5));
        System.out.println(solution.solution(2147483646, 2147483646, 10000));
    }
}
