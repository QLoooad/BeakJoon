package codingTest;

public class PG_폰번호가리기 {
	public static String solution(String phone_number) {
        StringBuffer sb = new StringBuffer();
        int numStart = phone_number.length()-4;
        int numBlind = phone_number.length()-5;
        for(int i = 0; i <= numBlind; i++) {
        	sb.append("*");
        }
        StringBuffer viewString = sb.append(phone_number.substring(numStart));
        String answer = sb.toString();
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("04444"));
	}
}
