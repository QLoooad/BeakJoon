package codingTest;

public class BJ4673 {

	public static void main(String[] args) {

		boolean[] check = new boolean[10001]; //초기값 false
		
		for(int i=0; i<10001; i++) {
			int N = d(i);
			if(N < 10001){	// 10000 이 넘는 수는 필요가 없음
				check[N] = true; //셀프넘버가 아닌 수를 true 로 변경
			}
		}
		for(int i=0; i<10001; i++) {
			if(!check[i]) { //check가 false 일때
				System.out.print(i+"\n");
			}
		}
	}
	public static int d(int number) { //셀프넘버가 아닌 수를 생성
		int sum = number;
		while(number != 0) {
			sum = sum + (number % 10);
			number = number/10;
		}
		return sum;
	}
}
