
public class PG_정수제곱근판별 {
	public static class Solution {
		public static long solution(long n) {
	        long answer = 0;
	        long sqrt = (long) Math.sqrt(n);
	        if(sqrt *sqrt == n) { //
	        	long nextSqrt = sqrt+1;
	        	answer = nextSqrt*nextSqrt;
	        }else {
	        	answer = -1;
	        }
	        return answer;
	    }
		public static void main(String[] args) {
			System.out.println(solution(3));
		}
	}
}
