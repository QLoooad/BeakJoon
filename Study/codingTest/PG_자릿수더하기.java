package codingTest;

public class PG_자릿수더하기 {
	public int solution(int n) {
        int answer = 0;
        String strNum = Integer.toString(n);
        for (int i = 0; i < strNum.length(); i++) {
        	answer += strNum.charAt(i) - '0'; // char은 숫자 할때 아스키로 됨
        }
        return answer;
    }
}
