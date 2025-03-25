import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        
        for(int i = 0; i< queries.length ;i++){
            sb = new StringBuilder();
            for(int a = queries[i][0]; a <= queries[i][1];a++){
                sb.append(my_string.charAt(a));
            }
            
            my_string = 
                my_string.substring(0,queries[i][0])+ 
                sb.reverse().toString()
                + my_string.substring(queries[i][1]+1,my_string.length());
        }
        
        answer = my_string;
        return answer;
    }
}