package codingTest;
import java.util.Scanner;

public class BJ10870 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		
		System.out.println(fivo(A));
	}
		private static int fivo(int A) {
			if(A==0) return 0;
			if(A==1) return 1;
			return fivo(A-1)+fivo(A-2);
	}

}
/*
0+1=1
1+1=2
1+2=3
2+3=5ㄴ
3+5=8*/