package CodingTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10809 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = br.readLine();
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {//배열을 모두 -1 로 변환
			arr[i] = -1; 
		}
		for(int i = 0; i < A.length(); i++){//입력된 영어의 위치마다 i 로 변경
			char ch = A.charAt(i);
			if(arr[ch-'a'] == -1) //arr의 해당자리가 -1일 경우에만 변경
			arr[ch-'a'] = i;	//즉 중복되는 알파벳은 넘어간다 라는 뜻
		}
		for(int arr2 : arr) { //전체를 반복한다
			System.out.print(arr2 + " ");
		}
	}

}
