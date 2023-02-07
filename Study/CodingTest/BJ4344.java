package CodingTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ4344 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int[] arr;
		StringTokenizer st;
		
		for(int i=0; i<testCase; i++) {
		/*nextToken은 StringTokenizer로 분리한 스트링을 차례로 불러옴
		nextToken을 사용하여 첫번째 스트링을 불러왔으면
		다른곳에서 다시 nextToken을 실행 시 두번때 스트링 불러옴 
		ex) 	String[] asd = a b c d;
				syso (st.nextToken()); = a
				syso (st.nextToken()); = b      */
			
			st = new StringTokenizer(br.readLine()," "); //학생 수, 성적 입력
			int N = Integer.parseInt(st.nextToken());
			
			arr = new int[N];
			double sum = 0; //성적 합
			
			for(int j = 0 ; j < N ; j++) { // N(학생 수)만큼 반복
				int A = Integer.parseInt(st.nextToken());//성적값이 들어옴 (위에서 학생 수 사용햇으니까)
				arr[j] = A;
				sum += A;
			}
			
			double avg = (sum / N) ;
			double count = 0;
			
			for(int j = 0 ; j < N ; j++) { // 평균 넘는 학생 찾기
				if(arr[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
			// 소숫점 3자리까지 표현 후 % 추가(%%) printf 검색 
		}
		
	}
}
 