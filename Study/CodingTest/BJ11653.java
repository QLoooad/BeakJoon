package CodingTest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BJ11653 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
 
		for (int i = 2; i <= Math.sqrt(N); i++) {
			while (N % i == 0) {//2부터 조건문에 부합하지 않을때까지
				System.out.println(i);
				N /= i; //2로 나누고 남은수 반복 2로 안되면 3으로
			}
		}
		if (N != 1) { // 나누다가 34일경우 34%2=0 은되지만 나눈 후 17은 불가능 하니 17도 호출해주는 역할
			System.out.println(N);
		}
	}
}