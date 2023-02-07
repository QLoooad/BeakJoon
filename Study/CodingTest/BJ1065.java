package CodingTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1065 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(hanSu(Integer.parseInt(br.readLine())));
		
		}
		public static int hanSu (int num) {
			
			int cut = 0; //한수 카운팅
			
			if(num<100) {
				return num;
			}
			else{
				cut = 99;
				for(int i = 100; i<=num;i++) {
					int hun = i / 100; // 백
					int ten = (i / 10) % 10; // 십
					int one = i % 10; // 일
					
				if((hun-ten)==(ten-one)) { //수열 체크
					cut++;
					}
				}
			}
			return cut;
		}
}