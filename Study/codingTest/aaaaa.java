package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class aaaaa {
    public static int[] divisible(int[] array, int divisor) {
    	int[] answer = Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        java.util.Arrays.sort(answer);
        return answer;
        }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
//        public void practice26() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        int arrSize = sc.nextInt();
        String[] strArr = new String[arrSize];
        
        int strCount = 1;
        
        for(int i = 0; i < strArr.length; i++) {
           System.out.print(strCount + "번째 문자열 : ");
           strArr[i] = sc.next();
           strCount++;
        }
        
        String[] totalArray;
        
        System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
        String yesOrNo = sc.next();
        
//        if(yesOrNo.equals("n")) {/////////////수정
//           System.out.println(Arrays.toString(strArr));          
//        }
        
        
        while(yesOrNo.equals("y")) {
           
           System.out.print("더 입력하고 싶은 개수 : ");
           int arrSize2 = sc.nextInt(); //
           
           arrSize = arrSize+arrSize2;    // 추가되는 사이즈 계산
//           String[] strArr2 = new String[arrSize2];
           totalArray = new String[arrSize];
           
           System.arraycopy(strArr, 0, totalArray, 0, strArr.length); // 1. 
           
           for(int i = strArr.length; i < totalArray.length; i++) {  // 처음 배열의 크기부터 토탈어레이에 넣기 위해 strarr로 시작 totalarray까지 포문
              System.out.print(strCount + "번째 문자열 : ");
              totalArray[i] = sc.next();
              strCount++;
           }
//           System.arraycopy(strArr, 0, totalArray, 0, strArr.length);
//           System.arraycopy(strArr2, 0, totalArray, strArr.length, strArr2.length);
           strArr = totalArray.clone(); // 토탈 어레이에 클론
           System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
           yesOrNo = sc.next();
           
//           if(yesOrNo2.equals("n")) {
//              System.out.println(Arrays.toString(totalArray)); 
//              break;
//           }
           
           
//           System.out.println(Arrays.toString(strArr));
//           System.out.println(Arrays.toString(strArr2));
//           System.out.println(Arrays.toString(totalArray));
        }
        System.out.println(Arrays.toString(strArr));
        
//        Arrays.toString(totalArray)
//        System.arraycopy(array1, 0, totalArray, 0, array1.length);
//        System.arraycopy(array2, 0, totalArray, array1.length, array2.length);
     }
 }
