import java.util.*;

class Solution {
    public Set<Integer> solution(int[] numbers) {
        Set<Integer> answer = new TreeSet<>(); //자동으로 내림차순 정렬해줌 - 그냥 SET은 순서 보장 안해줘서..
        
        for(int i = 0; i<numbers.length; i++){
            if(i!=numbers.length-1){
                for(int j=i+1;j<numbers.length;j++){
                    answer.add(numbers[i]+numbers[j]);
                }
            }
            
        }
        
        
        return answer;
    }
}