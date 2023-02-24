package codingTest;

import java.util.StringTokenizer;

public class PG_JadenCase문자열 {
	
	public String solution(String s) {
		String str = s.toLowerCase();
		
		String str1 = "3people";
		
		StringTokenizer st = new StringTokenizer(str, " ");
		int wordCount = st.countTokens();//3
		String[] strArr = new String[wordCount];
		char[] strChar;
		
		for(int i = 0; i < wordCount; i++) {
			
			String stStr = st.nextToken().toString();
			int stStrLength = stStr.length();
			strChar = stStr.toCharArray();
			
			if(strChar[0] >= 48 && strChar[0] <= 57) {
				String charToStr = new String(strChar);
				strArr[i] = charToStr;
			}
			if(strChar[0] >= 97 && strChar[0] <= 122) {
				strChar[0] = (char)((int)strChar[0]-32);
				String charToStr = new String(strChar);
				strArr[i] = charToStr;
			}
		}
		
		String resutl = "";
		
		resutl = String.join(" ", strArr);
        return resutl;
    }

	public static void main(String[] args) {

		String str = " 3people unFollowed me ";
		String strResult = "Hello 1world";
		
		str = str. toLowerCase();
		
		String str1 = "3people";
		
		StringTokenizer st = new StringTokenizer(str, " ");
		int wordCount = st.countTokens();//3
		String[] strArr = new String[wordCount];
		char[] strChar;
		
		for(int i = 0; i < wordCount; i++) {
			
			String stStr = st.nextToken().toString();
			int stStrLength = stStr.length();
			strChar = stStr.toCharArray();
			
			if(strChar[0] >= 48 && strChar[0] <= 57) {
				String charToStr = new String(strChar);
				strArr[i] = charToStr;
			}
			if(strChar[0] >= 97 && strChar[0] <= 122) {
				strChar[0] = (char)((int)strChar[0]-32);
				String charToStr = new String(strChar);
				strArr[i] = charToStr;
			}
		}
		
		String resutl = "";
		
		resutl = String.join(" ", strArr);
		
		System.out.println(resutl);
		
		System.out.println(strResult);
		//미완 공백 개수도 똑같이 바꿔야됨
		
	}

}
