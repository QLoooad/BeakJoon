package CodingTest;
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
/*
 * 2차 for문 count 왜 index로 복제하는가
 * count를 if에 넣으면 arr를 비교할때 중간에 비교하는 수 보다 작은수가 있으면
 * 위치정보 카운트를 하지 않기에 for문에 count를 넣고
 * if를 지날때마다 위치정보 카운트가 올라가게 한다음 해당 수를 index에 넣어서 
 * 끝까지 증가(arr의 총 개수만큼)하는 count에 대비하기 위함  
 */
