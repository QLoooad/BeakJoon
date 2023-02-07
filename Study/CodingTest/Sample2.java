package CodingTest;
import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if(a.contains("+")) {
            String[] b = a.split("\\+");// split 해줄때 특수문자앞에 \필요함
            System.out.println(Integer.parseInt(b[0])+Integer.parseInt(b[1]));
        }
        else if(a.contains("-")) {
            String[] b = a.split("\\-");
            System.out.println(Integer.parseInt(b[0])-Integer.parseInt(b[1]));
        }
        else if(a.contains("*")) {
            String[] b = a.split("\\*");
            System.out.println(Integer.parseInt(b[0])*Integer.parseInt(b[1]));
        }
        else if(a.contains("/")) {
            String[] b = a.split("\\/");
            System.out.println(String.format("%.2f",(double)Integer.parseInt(b[0])/Integer.parseInt(b[1])));
        }
    }//main end
}