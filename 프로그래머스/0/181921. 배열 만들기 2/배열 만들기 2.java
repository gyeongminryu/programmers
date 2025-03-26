import java.util.*;
class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();

        String n = "";
        boolean b = false;
        
        
        for(int i = l; i <= r; i++){
            b = true;
            n = String.valueOf(i);
            
            String[] arr = n.split("");
            
            for(int a = 0; a < arr.length; a++){
                if(!arr[a].equals("5") && !arr[a].equals("0")){
                    b = false;
                }
            }
            
            if(b){
                  answer.add(i);  
              }
        }        
        
        if(!b &&answer.size()==0){
            answer.add(-1);
        }
        
        return answer;
    }
}