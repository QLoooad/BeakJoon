import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BJ2739_구구단 {
	public static void main(String[] args) throws IOException {
		System.out.println("원하시는 단수를 입력하세요.");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br1.readLine());	
		System.out.println("어디까지 곱할지 입력해주세요.");
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		int b = Integer.parseInt(br2.readLine());
		br1.close();
		br2.close();
        
		for(int i = 0; i<=b;i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
}