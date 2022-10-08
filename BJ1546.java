import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1546 {
//버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 
//버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 
//버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 
//버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 버퍼리더 예외필수 
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ea = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] arr = new int[ea];
		for(int i=0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		float reTouch = 0;
		float max = 0;
		
		for(int array : arr) {
			if(max < array) {
				max = array;
			}
		}
		float[] arr2 = new float[ea];
		for(int i=0; i < arr.length; i++) {
			arr2[i] = ((float)arr[i]/max)*100;
			reTouch += arr2[i]; 
		}////reTouch = reTouch + arr2[i];축약 축약 축약 축약 축약 축약 
		System.out.println(reTouch/ea);
	}

}
