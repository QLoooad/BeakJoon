package codingTest;

public class PG_시저함호 {
	
	public static String solution(String s, int n) {
		
		char[] charArr = s.toCharArray();
		
		for(int i = 0; i < s.length(); i++) {
			
			if(charArr[i] != ' ') { // char이 공백이 아닐때
				if(charArr[i] >= 65 && charArr[i] <= 90) { //소문자 
					charArr[i] = (char)(charArr[i] + n);
					if(charArr[i] > 90) {
						charArr[i] = (char)(charArr[i]-26);
					}
				}else if(charArr[i] >= 97 && charArr[i] <= 122) {//대문자
					charArr[i] = (char)(charArr[i] + n);
					if(charArr[i] > 122) {
						charArr[i] = (char)(charArr[i]-26);
					}
				}
			}
		}
		String s2 = new String(charArr);
        return s2;
    }

	public static void main(String[] args) {

		String s = "AaZz";
		int n = 25;
		char[] charArr = s.toCharArray();
		
		for(int i = 0; i < s.length(); i++) {
			
			if(charArr[i] != ' ') { // char이 공백이 아닐때
				if(charArr[i] >= 65 && charArr[i] <= 90) { //소문자 
					charArr[i] = (char)(charArr[i] + n);
					if(charArr[i] > 90) {
						charArr[i] = (char)(charArr[i]-26);
					}
					
				}else if(charArr[i] >= 97 && charArr[i] <= 122) {//대문자
					charArr[i] = (char)(charArr[i] + n);
					if(charArr[i] > 122) {
						charArr[i] = (char)(charArr[i]-26);
					}
				}
			}
		}
		String s2 = new String(charArr);
		
		System.out.println(solution(s,n));
		System.out.println(s2);
		System.out.println("ZzYy");
	}

}
