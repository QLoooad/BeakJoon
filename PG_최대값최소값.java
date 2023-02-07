package test;

import java.util.Arrays;

public class PG_최대값최소값 {
   
public String solution(String s) {
        
      String[] words1 = s.split(" ");
       int[] words2 = new int[words1.length];
   
       for(int i = 0; i < words1.length; i++) {
           words2[i] = Integer.parseInt(words1[i]);
       }
       Arrays.sort(words2);
       String min = Integer.toString(words2[words2.length-1]);
       String max = Integer.toString(words2[0]);
   
       return max+" "+min;
    }
   
   public static void main(String[] args) {
      String s = "-3 -2 -1 -4";
      
      String[] words1 = s.split(" ");
       int[] words2 = new int[words1.length];
   
       for(int i = 0; i < words1.length; i++) {
           words2[i] = Integer.parseInt(words1[i]);
       }
       Arrays.sort(words2);
       String min = Integer.toString(words2[words2.length-1]);
       String max = Integer.toString(words2[0]);
        System.out.println(min+max);
   }

}