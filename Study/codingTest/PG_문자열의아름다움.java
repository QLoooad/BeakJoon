package codingTest;

import java.util.StringTokenizer;

public class PG_문자열의아름다움 {
	
    public static long solution(String s) {
        long answer = 0;
        String[] strArr = s.split("");
        StringTokenizer st = new StringTokenizer(s, "");
        for(int i = 0; i < strArr.length; i++) {
        	if(strArr[i].equals(st.nextToken().toString())) {
        		
        	}
        	
        }
        return answer;
    }

	public static void main(String[] args) {
		String str = "baby";
		System.out.println(solution(str));
		
		
		
		String s = "baby";
		String[] strArr = s.split("");
        for(int i = 0; i < strArr.length; i++) {
        	System.out.println(strArr[i]);
        }
        
	}

}
