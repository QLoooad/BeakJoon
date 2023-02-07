
public class PG_없는숫자더하기 {

	public static int solution(int[] numbers) {

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		int result = 45 - sum;
		return result;
	}

	public static void main(String[] args) {

	}

}
