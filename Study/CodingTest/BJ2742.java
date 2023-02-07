package CodingTest;
import java.io.*;

 //구구단 응용 (2741번 반대)
public class BJ2742 {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());	
		br.close();
        
		for(int i = 0; i<a;i++) {
			bw.write(a-i+"\n");
		}
		bw.flush();
		bw.close();
	}
}