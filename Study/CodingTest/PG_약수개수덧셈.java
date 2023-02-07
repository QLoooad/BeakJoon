package CodingTest;

public class PG_약수개수덧셈 {
	public static int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) { //n~m 까지 돌리고
			int count = 0;
			for(int j = 1; j <= i; j++) {
	        	if(i%j == 0) {
	        		count++;
	        	}
	        }
			answer = (count%2 == 0) ? answer+i : answer-i;
		}
        return answer;
    }
	public static void main(String[] args) {
		/*int n = 24;
		int m = 27;
		
		int answer = 0;
		
		
		for(int i = n; i <= m; i++) { //n~m 까지 돌리고
			int count = 0;
			for(int j = 1; j <= i; j++) {
	        	if(i%j == 0) {
	        		count++;
	        	}
	        }
			answer = (count%2 == 0) ? answer+i : answer-i;
		}
		
		System.out.println(answer);*/
		System.out.println(solution(13,17));
		
	}

}
