import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int i = 0;
           
       
        Map <String,Integer> map = new HashMap<>();
        
        for(i= 0; i < name.length ; i++){
            map.put(name[i],yearning[i]);
        }    
        
        for(i=0 ; i < photo.length ; i++){
            int plus = 0; 
            for(int j = 0; j < photo[i].length; j++){
               if(map.get(photo[i][j])!=null){
                plus+=map.get(photo[i][j]);   
               }
            }
            answer[i] = plus;
        }
        
        return answer;
    }
}