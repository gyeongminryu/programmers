import java.util.*;

class Solution {
    public List<Integer> solution(int num, int total) {
        List<Integer> answer = new ArrayList<>();
        
        int plus = 0;
        int n = 0;
        for(int i = 1; i< num+1;i++){
            plus+=i;
        }
        
        n=(total - plus)/num;
        
        
        for(int i = 1; i< num+1;i++){
            answer.add(n+i);
        }
            
        return answer;
    }
}