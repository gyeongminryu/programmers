import java.util.ArrayList;
import java.util.Collections;

class Solution {
        public ArrayList<Integer> solution(int[] arr) {
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length;i++) {
        	answer.add(arr[i]);
        }
        
        int min = Collections.min(answer);
        //System.out.println(min);
        
        answer.remove(answer.indexOf(min)); //.remove(인덱스)
        //System.out.println(answer);
        
        if(answer.size()==0) {
        	answer.add(-1);
        }
        return answer;
    }
}