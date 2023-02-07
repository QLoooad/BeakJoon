package CodingTest;

public class PG_수박수박수 {
	
	public static String solution(int n) {
        String answer = "";
        return answer;
    }
	
	public static void main(String[] args) {
		int n = 9;
		String s = "";
		
		for(int i = 0; i < n; i++) {
			s += (i%2 == 0) ? "수" : "박";
		}
		
		System.out.println(s);
		
		
	}

}
