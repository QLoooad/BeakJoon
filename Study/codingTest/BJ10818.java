package codingTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10818 {

	public static void main(String[] args) throws IOException { ///////버퍼 사용시 예외필수

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //외워

		int ea = Integer.parseInt(br.readLine()); //버퍼는 무조껀 스트링으로 입력, 인트로 바꿈
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int[] arr = new int[ea];
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i] ) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		br.close();
		System.out.println(min + " " + max);
		/*Arrays.sort(arr); // array를 오름차순으로 정렬 ex) 1,2,3,5
		System.out.print(arr[0] + " " + arr[arr.length-1]); */
	}	//Arrays.sort(arr); 너무 오래걸림 321MB 2564ms
		//java.lang.ArrayIndexOutOfBoundsException 
		//18번째 줄 arr.length-1 안하면 위 에러 생김
		//입력한 배열의 개수를 넘어서기때문(0부터 1부터 인지 서로 다름)
}///////////////////////////////////이거풀고 3052번
