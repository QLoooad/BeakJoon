package CodingTest;

public class PG_이상한문자만들기 {
	
	public static String solution(String s) {
		
		String changeS = s.toLowerCase();
		char[] charArr = changeS.toCharArray();
		
		for(int i = 0; i < charArr.length; i++) {
			if( i % 2 != 1 ) {
				charArr[i] = (char)(charArr[i]-32);
			}
		}
		 String s2 = new String(charArr);
		 
        return s2;
    }

	public static void main(String[] args) {

		String s = "abc abcd abcde";
		String changeS = s.toLowerCase();
		
		char[] charArr = changeS.toCharArray();
		int count = 1;
		
		for(int i = 0; i < charArr.length; i++) {
			if( i % 2 != 1 ) {
				if(charArr[i] != ' '){//공백 확인
					charArr[i] = (char)(charArr[i]-32);
					count++;
				}
				
			}
		}
		 String s2 = new String(charArr);
		 System.out.println(solution(s));
		 System.out.println("AbC AbCd AbCdE");
	}

}
