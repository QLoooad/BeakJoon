import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 //구구단 응용
public class BJ2741 {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());	
		br.close();
        
		for(int i = 0; i<a;i++) {
			System.out.println(1+i);
			
		}
	}
}