package CodingTest;

public class PG_부족한금액계산 {
	
	public static long solution(int price, int money, int count) {
		
		long totalPrice = 0L;
		
		for(int i = 1; i <= count; i++) {
			totalPrice += price * i;
		}
		
		long result = totalPrice-money;
		
		if(totalPrice-money < 0) {
			result = 0;
		}
        return result;
    }

	public static void main(String[] args) {

		int price = 3;
		int money = 30;
		int count = 4;
		long totalPrice = 0L;
		
		for(int i = 1; i <= count; i++) {
			totalPrice += price * i;
		}
		
		long result = totalPrice-money;
		
		if(totalPrice-money > 0) {
			result = 0;
		}
		
		System.out.println(result);
		System.out.println(solution(3,20,4));
		
	}

}
