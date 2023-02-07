package CodingTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ11654 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char N = br.readLine().charAt(0);
		int A = (int)N;
		System.out.println(A);
	}

}
