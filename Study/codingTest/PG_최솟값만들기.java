package codingTest;

import java.util.Arrays;

public class PG_최솟값만들기 {
	
	public static int solution(int []A, int []B) {
    
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int BNum = B.length;
        for(int i = 0; i<A.length; i++){
        	answer += A[i]*B[BNum-1];
        	BNum--;
        }


        return answer;
    }

	public static void main(String[] args) {
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		Arrays.sort(A);
		Arrays.sort(B);
		
		System.out.println(solution(A,B));
		

	}

}
