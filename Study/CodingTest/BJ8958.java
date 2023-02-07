package CodingTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ8958 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ea = Integer.parseInt(br.readLine());
		String arr[] = new String[ea];
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}
		
		for(int i = 0; i < ea; i++) {
			int sum=0; 
			int cnt = 0;
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j)=='O') {
					cnt++;
					sum += cnt;
				}else {
					cnt = 0;
				}
			}
			System.out.println(sum);
		}
	}

}
