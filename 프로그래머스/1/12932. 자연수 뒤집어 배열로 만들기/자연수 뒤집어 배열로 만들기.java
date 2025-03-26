import java.util.*;
class Solution {
    public int[] solution(long n) {
        
        String a = Long.toString(n);
        int[] answer = new int[a.length()];
        
        
        StringBuffer sb = new StringBuffer();
        for(int i =0 ; i< a.length(); i++){
            sb.append(a.charAt(i));
        }
        
        a= sb.reverse().toString();
       
         for(int i =0 ; i< a.length(); i++){
            answer[i]= a.charAt(i) - '0';
        }      
        return answer;
    }
}