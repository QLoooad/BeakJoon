package codingTest;

public class PG_이상한문자만들기 {
	
	public static String solution(String s) {
		
		String changeS = s.toLowerCase();
		
		char[] charArr = changeS.toCharArray();
		int count = 1;
		
		for(int i = 0; i < charArr.length; i++) {
			if( count % 2 == 1 ) {
				if(charArr[i] != ' '){//공백이 아니면 해당 번호 대문자로 변환 공백이면 count--로 하고 아무것도안함
					charArr[i] = (char)(charArr[i]-32);
				}else if(charArr[i] == ' '){
					count--;
				}
			}
			count++;
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
			if( count % 2 == 1 ) {
				if(charArr[i] != ' '){//공백 확인 공백이면 카운트 -1 후 카운트 숫자 기준으로 대문자 변환
					charArr[i] = (char)(charArr[i]-32);
				}else if(charArr[i] == ' '){
					count--;
				}
			}
			count++;
		}
		 String s2 = new String(charArr);
		 System.out.println(s2);
		 System.out.println(solution(s));
		 System.out.println("AbC AbCd AbCdE");
	}

}
