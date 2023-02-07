package CodingTest;
import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) { 
		System.out.println("[string 문자열 형식 사칙 연산식을 사용해 연산자 우선순위로 사칙연산 계산 실시]");
		
		/*[설 명]
		 * 1. Scanner : 사용자로부터 문자열을 입력받음
		 * 2. input.indexOf(문자) : 찾을려는 문자가 없으면 -1 값을 반환합니다
		 * 3. 사칙 연산자 우선 순위 : * , / , + , -
		 * 4. 로직 : 사용자가 입력한 문자열 파악 > 올바른 사칙 연산 식이면 > 사칙연산 계산 수행	
		 * 5. 5+2*10/5-5 계산 설명 : [2]*[10] = 20 > 20/[5] = 4 > [5]+4 = 9 > 9-[5] = 4 	 
		 * */
		
		//TODO Scanner 객체 선언해 사용자로부터 문자열을 입력 받습니다
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사칙 연산 식  입력 : ");		
		String input = scan.next();
		System.out.println("");	
		
		//TODO 입력된 문자열이 한글, 영문 포함여부 확인 및 정수, 사칙연산부호 포함여부 확인 수행
		boolean ke_check = false;
		boolean ns_check = false;
		for(int i=0; i<input.length(); i++) {
			String word = getWordType(String.valueOf(input.charAt(i)));
			//System.out.println(input.charAt(i)+" : "+word);
			if(word.contains("english") || word.contains("korean")) {		
				ke_check = true;
			}
			if(word.contains("number") || word.contains("special")) {
				ns_check = true;
			}
		}
		
		//TODO 사칙연산 수행 실시
		if(ke_check != true && ns_check == true) { //입력된 문자열이 한글, 영문이 아닌 경우 
			System.out.println("[Success] 사칙연산 수행을 시작합니다 ");
			System.out.println("사칙 연산 식 : "+input);
			int output = calc(input); //calc 메소드 호출 실시
			System.out.println("사칙 연산 결과 : "+output);
		}
		else {
			System.out.println("[Fail] 한글 및 영문, 사칙연산 외 특수 문자열이 포함되어있습니다 ... ");		
		}		
		
	}//메인 종료
	
	//TODO 문자열을 판별하는 메소드
	public static String getWordType(String word){				
		//문자열 판별을 위한 변수 선언 실시
		String data = "";
		boolean number = false;
		boolean english = false;
		boolean korean = false;
		boolean special = false;

		//for 반목문을 수행해 문자열을 한글자씩 분리해 decimal로 변환 후 문자열 판별 실시		
		for(int i=0; i<word.length(); i++){
			int value = word.charAt(i);
			if(value >= 48 && value <= 57){ //숫자
				number = true;
			}
			else if(value >= 65 && value <= 90 //대문자 
					|| value >= 97 && value <= 122){ //소문자
				english = true;
			}
			else if(value == 42 || value == 43 || 
					value == 45 || value == 47) { //사칙연산 특수문자
				special = true;
			}
			else{ //한글
				korean = true;
			}
		}
	      
		if(number){
			data = "number";		        
		}
		if(english){
			data = "english";			
		}
		if(korean){
			data = "korean";			
		}
		if(special) {
			data = "special";
		}
		return data;
	}
	
	//TODO 사칙 연산을 수행하는 재귀 메소드
	public static int calc(String input) { 
		int idx; 		
		idx = input.indexOf('+'); //TODO [+] 문자의 인덱스 위치 확인
				
		if (idx != -1) { //TODO [+] 문자가 있으니까 -1이 아니여야 함 (indexOf는 찾을려는 문자가 없으면 -1 반환)			
			return calc(input.substring(0, idx)) + calc(input.substring(idx + 1)); 
		} 
		else { //TODO [+] 문자가 없을 경우는 [-], [*], [/] 연산자 포함 여부를 확인합니다
			idx = input.indexOf('-'); 
			if (idx != -1) { 
				return calc(input.substring(0, idx)) - calc(input.substring(idx + 1)); 
			} 
			else {
				idx = input.indexOf('*'); 
				if (idx != -1) {
					return calc(input.substring(0, idx)) * calc(input.substring(idx + 1)); 
				} 
				else { 
					idx = input.indexOf('/'); 
					if (idx != -1) { 
						return calc(input.substring(0, idx)) / calc(input.substring(idx + 1));
					} 
				} 
			} 
		}
			
		String data = input.trim();
		if (data == null || data.isEmpty()) {
			return 0;
		}  
			 			
		return Integer.parseInt(data); 
	} 
	
}//클래스 종료