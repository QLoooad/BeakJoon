import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ9020 {

	static boolean prime[] = new boolean[10001];

	private static void Is_Prime(int N) {
		prime[0] = prime[1] = true;

		for (int i = 2; i * i <= N; i++) {
			// prime[i]가 소수라면
			if (!prime[i]) {
				// prime[j] 소수가 아닌 표시
				for (int j = i * i; j <= N; j += i)
					prime[j] = true;
			}
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			
			int setNum = Integer.parseInt(br.readLine());
			int up = setNum / 2;
			int down = setNum / 2;
			
			Is_Prime(setNum);// 소수
			
			while (true) {
				//false가 소수
				//두개가 모두 소수일경우
				if (!prime[up] && !prime[down]) {
					System.out.println(up + " " + down);
					break;
				}
				up--;
				down++;
			}
		}
	}
}
