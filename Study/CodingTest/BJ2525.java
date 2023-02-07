package CodingTest;
import java.util.Scanner;
 
public class BJ2525 {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
        
		int H = in.nextInt();
		int M = in.nextInt();
		int set = in.nextInt();
		
		 H = H + set/60;
	     M = M + set%60;
		
		in.close();
		
		if(M>59) {
			H++;
			M = M-60;
		} if(H>23) {
			H = H-24;
		}
		System.out.println(H + " " + M);
		
	}	
	
}