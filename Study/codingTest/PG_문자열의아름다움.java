package codingTest;

import java.util.ArrayList;
import java.util.List;
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
//		System.out.println(solution(str));
		
//		List<Character> a = new ArrayList<>();
//		for (int i = 0; i < str.length(); i++) {
//			a.add(str.charAt(i));
//		}
		String[] strArr = str.split("");
		StringTokenizer st = new StringTokenizer(str, "");
		
		int result = 0;
		for (int i = 0; i < strArr.length; i++) {
			String searchStr = st.nextToken().toString();// 1글자씩 꺼내기

			for (int j = 0; j < strArr.length; j++) {
				if (strArr[i].equals(searchStr)) {
					int sco = 0;
					result++;
				} else {

				}

			}
		}
		System.out.println(result);
        
	}

}
