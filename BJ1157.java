import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1157 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26]; //영어 A~Z
		String s = br.readLine();
		s = s.toUpperCase();
		
		for (int i = 0; i < s.length(); i++) {
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // 대문자 범위  : a<i<z 안됨 : a<i&&i<z 됨
				arr[s.charAt(i) - 'A']++;	// 해당 인덱스의 값 1 증가
			}
		}
		int max = -1;
		char ch = '@';
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {//arr이 max보다 크면 (16번줄) arr를 max로 변경
				max = arr[i];
				ch = (char) (i + 65); // 대문자 65~90 이후 ch를 해당 대문자로 변경
			}
			else if (arr[i] == max) { // max가 arr과 같다면 최빈값이 중복이므로 ?로 변경
				ch = '?';			 //  최빈값이 중복이면 ? 호출 하라는 문제임
			}
		}
		System.out.print(ch);
	}
}