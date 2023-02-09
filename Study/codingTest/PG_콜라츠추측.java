package codingTest;


public class PG_콜라츠추측 {
	public static int solution(int num) {
        int answer = 0;
        int N = num;
        while(N != 1) {
        	if(N % 2 == 0) { //짝수 일때
        		N = N / 2;
        	}else if(N % 2 == 1){
        		N = (N * 3) + 1;
        	}
        	answer++;
        	if(answer > 500){
        		answer = -1;
                break;
            }
        }
        return answer;
    } /*이 문제의 주의점 int를 하면 수를 계산하는중에 int의 최대값을 넘어가버린다
    	오버플로우
     	13번째 줄이 없다면 무한루프*/
	public static void main(String[] args) {
		System.out.println(solution(16));
	}
}
