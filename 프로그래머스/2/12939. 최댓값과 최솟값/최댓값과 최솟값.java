import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        
        int [] int_arr = new int[arr.length];
        
        for(int i =0 ;i <arr.length ;i++){
            int_arr[i]= Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(int_arr);
        int min = int_arr[0];
        int max = int_arr[int_arr.length -1];
        answer = min + " " + max;
        return answer;
    }
}