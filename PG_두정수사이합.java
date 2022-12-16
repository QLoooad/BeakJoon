
public class PG_두정수사이합 {
	public static long solution(int a, int b) {
        long answer = 0;
        int bigNum = (a < b)? b : a;
        int smallNum = (a < b)? a : b;
        for(long i = smallNum, j = 0; j <= bigNum-smallNum; i++,j++) {
        	answer += i;
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(3,3));
	}
}
