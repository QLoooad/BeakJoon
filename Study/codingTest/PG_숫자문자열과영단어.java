package codingTest;

public class PG_숫자문자열과영단어 {
	
	public static int solution(String s) {
		int answer = 0;
        
        return answer;
    }

	public static void main(String[] args) {
		String s = "123";
		String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		for(int i = 0; i < 10; i++) {
			s = s.replace(num[i],Integer.toString(i));
		}// 전부 스캔 후 배열과 같은 string 있을시 바꿈 없으면 안바꿈
		int changeS = Integer.parseInt(s);
		System.out.println(changeS);
	}

}
