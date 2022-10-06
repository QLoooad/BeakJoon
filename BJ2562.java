import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2562 {
//버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 
//버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 
//버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 
//버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 
	public static void main(String[] args) throws IOException { 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		
		for(int i=0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int max = 0;
		int count = 0;
		int index = 0;
		for(int arr2 : arr) {
			count++;
			if(arr2 > max) {
				max = arr2;
				index = count;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}

}
