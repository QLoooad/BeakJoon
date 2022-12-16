import java.util.Arrays;
import java.util.Collections;

public class PG_정수내림차순 {
	public static long solution(long n) {
        StringBuffer sb = new StringBuffer();
        String nStringChange = Long.toString(n);
        int nLength = nStringChange.length();
        Integer[] nArray = new Integer[nLength];
        for(int i = 0; i < nLength; i++) {
        	nArray[i] = (int) nStringChange.charAt(i)-'0';
        }
        Arrays.sort(nArray, Collections.reverseOrder());
        for(int i = 0; i < nLength; i++) {
        	sb.append(nArray[i]);
        }
        String sbToString =  sb.toString();
        long answer = Long.parseLong(sbToString);
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(123456789));
	}
}
