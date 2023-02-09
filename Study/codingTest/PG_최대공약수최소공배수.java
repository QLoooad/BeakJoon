package codingTest;

public class PG_최대공약수최소공배수 {
	
	public int[] solution(int n, int m) {
		
		int[] result = new int[2];
		
		int max = 0;
		for(int i=1; i<=n && i<=m; i++) {
			if(n%i==0 && m%i==0)
			{
				max = i;
			}
		}		
		int min = (n*m)/max;
		
		result[0] = max;
		result[1] = min;
		return result;
    }

	public static void main(String[] args) {

		int a = 2;
		int b = 5;
		int[] result = new int[2];
		
		int max = 0;
		for(int i=1; i<=a && i<=b; i++) {
			if(a%i==0 && b%i==0)
			{
				max = i;
			}
		}		
		int min = (a*b)/max;
		
		result[0] = max;
		result[1] = min;
	}

}
