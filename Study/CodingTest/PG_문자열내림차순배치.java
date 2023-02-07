package CodingTest;

import java.util.Arrays;

public class PG_문자열내림차순배치{
	
	public static String solution(String s) {
		
		String change = "";
		char[] cString = new char[s.length()];
		//String.toCharArray() << 아래 for문 대신 좌측메소드 있음
		for(int i = 0; i < s.length(); i++) {
			cString[i] = s.charAt(i);
		}
		Arrays.sort(cString);
		for (int j = 0; j < cString.length; j++) {
		    change+= Character.toString(cString[j]);
		}
		StringBuffer sb = new StringBuffer(change);
		String reversedStr = sb.reverse().toString();
		
        return reversedStr;
    }

	public static void main(String[] args) {
		
		/*String s = "Zbcdefg";
		String change = "";
		char[] cString = new char[s.length()];
		for(int i = 0; i < s.length(); i++) {
			cString[i] = s.charAt(i);
		}
		Arrays.sort(cString);
		for (int j = 0; j < cString.length; j++) {
		    change+= Character.toString(cString[j]);
		}
		StringBuffer sb = new StringBuffer(change);
		String reversedStr = sb.reverse().toString();
		System.out.println(reversedStr);*/
		System.out.println(solution("Zbcdefg"));
	}

}
