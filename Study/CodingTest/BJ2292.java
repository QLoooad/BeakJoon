package CodingTest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BJ2292 {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 1; // 최소 방 거리
		int range = 1; // 첫 방 무조껀 1
		
		if (N == 1) {
			System.out.print(1);
		}else{
			while(range < N){
				range = range + (6*cnt);
				cnt++;
			}
			System.out.println(cnt);
		}
		
	}
}
