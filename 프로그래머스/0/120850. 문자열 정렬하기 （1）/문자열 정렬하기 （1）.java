import java.util.*;
class Solution {
    public List<Integer> solution(String my_string) {
    
        List<Integer> answer = new ArrayList<>();
        int a = 0;
        String[]arr = my_string.split("");
        
        for(int i = 0; i< arr.length;i++){
            try{
                a = Integer.parseInt(arr[i]);
                answer.add(a); 
            }catch(NumberFormatException e){
                
            }          
            
        }      
        
        Collections.sort(answer);
        return answer;
    }
}