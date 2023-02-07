import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10807 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ea = Integer.parseInt(br.readLine()); //버퍼는 무조껀 스트링으로 입력, 인트로 바꿈
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int find = Integer.parseInt(br.readLine());
		int[] arr = new int[ea]; // 30이 들어가면 0~29
		int count = 0;
		
		for(int i=0; i < arr.length; i++) { // arr에 하나씩 " " 를 기준으로 담음
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i < arr.length; i++) {
			if(arr[i] == find) {
				count += 1;
			}
		}
		System.out.println(count);
	}

}
