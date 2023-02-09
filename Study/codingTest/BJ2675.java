package codingTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2675 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TestCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<TestCase; i++) {
			String[] arr = br.readLine().split(" ");
			
			int Re = arr[0].charAt(0)-'0';
			String S = arr[1];
			
			for(int j=0; j<S.length(); j++) {
				for(int k=0; k<Re; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}