package codingTest;

import java.util.StringTokenizer;

public class PG_JadenCase문자열 {
	
	public String solution(String s) {
        String answer = "";
        return answer;
    }

	public static void main(String[] args) {

		String str = "3people unFollowed me";
		str = str. toLowerCase();
		String strResult = "3people Unfollowed Me";
		
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
		
		for(int i = 0; i < wordCount; i++) {
			StringBuffer strBuf = new StringBuffer(strArr[i].toString());
			if(i != 0) {
				str.append(strBuf);
			}
		}
		
		System.out.println(strResult);
		
	}

}
