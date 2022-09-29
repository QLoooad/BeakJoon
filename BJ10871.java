import java.util.Scanner;

public class BJ10871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ea = sc.nextInt();
		int setInt = sc.nextInt();
		int[] arr = new int[ea];
		
		for(int i=0; i < ea; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i < ea; i++) {
			
			if(arr[i]<setInt) {
				System.out.print(arr[i] + " ");
		}
		
	}

	}}
