import java.util.Scanner;

public class BJ3003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[6];
		int[] chess = {1,1,2,2,2,8};
		
		
		for (int i = 0; i < 6; i++) {
			input[i] = sc.nextInt(); 
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(chess[i]- input[i]+ " ");
		}
		
}}
/*
 1.스캐너 작동
 2.인풋6개 만듦
 3.체스 기물 수 적용
 4.sc에 들어오는 수 인풋배열에 차례로 6개 입력
 5.체스와 인풋 개수 "-" 6번 실행
 */