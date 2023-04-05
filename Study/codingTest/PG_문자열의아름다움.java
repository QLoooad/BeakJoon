package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

	public static void main(String[] args) throws IOException {
		String str = "baby";
//		System.out.println(solution(str));
		
//		List<Character> a = new ArrayList<>();
//		for (int i = 0; i < str.length(); i++) {
//			a.add(str.charAt(i));
//		}
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		char[] s = br.readLine().toCharArray();
//        char[] t = br.readLine().toCharArray();
        
		String[] strArr = str.split("");
		StringTokenizer st = new StringTokenizer(str);
		String searchStr = st.nextToken().toString();
//		int result = 0;
//		for (int i = 0; i < strArr.length; i++) {
//			int searchStrNum = 0; // 꺼낸 searchStr의 index
//			searchStr = st.nextToken().toString();// 1글자씩 꺼내기
//			
//			for (int j = 0; j < strArr.length; j++) {
//				int leng = 0;
//				leng++;
//				if (strArr[i].equals(searchStr)) {
//					result += i - searchStrNum;
//				} else {
//
//				}
//			}
//			searchStrNum++;
//		}
		System.out.println(searchStr);
        
	}

}
