package CodingTest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class BJ2869 {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		//토큰 사용해 하나씩 빼감 (ex/ 1 2 3  일때)
		int up = Integer.parseInt(st.nextToken()); // 1   (2 3)
		int down = Integer.parseInt(st.nextToken());// 2  (  3)
		int high = Integer.parseInt(st.nextToken());// 3  (   )
		
		int day = (high - down) / (up - down);
		if((high - down) % (up - down) != 0) {
			day++; //딱 떨어지지 않으면 day +1
		}
		System.out.println(day);
	}
}
