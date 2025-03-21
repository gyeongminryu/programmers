import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
               
        
        for(String str : participant){
            if(map.get(str)!=null){
               map.put(str,map.get(str)+1);
            }else{
                map.put(str,1);
            }
        }
        
        
        for(int i =0; i< completion.length;i++){
            if(map.containsKey(completion[i])){
                map.put(completion[i], map.get(completion[i])-1);
            }
        }
        
        //맵의 keySet 가져오고, keySet을 분리하면서 value가 0이상인 것의 key 가져오기
        
        for(String k : map.keySet()){
            if(map.get(k)>0){
                answer = k;
            }
        }
       
        return answer;
    }
}