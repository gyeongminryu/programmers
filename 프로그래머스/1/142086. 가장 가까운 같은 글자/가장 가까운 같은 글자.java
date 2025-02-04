import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        //같은 글자 
        Map <Integer,Integer> map = new HashMap();
        
        String[] arr= s.split("");
        System.out.println(Arrays.toString(arr));
        
        
        for(int i = 0; i < s.length(); i++){
            
        //각 위치마다 자신보다 앞에 나왔고
            //지금까지 같은 글자 나온게 없으면 -1 (Map 사용)
        	
        	
            if(!s.substring(0, i).contains(arr[i])){
            	
            	answer[i] = -1;
            }else{
                //지금까지 같은 글자 나온게 있으면 
                //자신과 가장 가까운 곳에 있는 글자
                    //자신의 index 기준 substring
                    String str = s.substring(0,i);
                    answer[i] = i - str.lastIndexOf(arr[i]);

            }
            
        
        }
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}