import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[]arr = new String[numbers.length];
        
        for(int i = 0; i< arr.length ; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        
        //합한 것이 큰 순서대로 정렬됨 
        Arrays.sort(arr,(o1,o2)-> (o2+o1).compareTo(o1+o2));
        
        //정렬 결과를 append
        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(s);
        }
        
        if(arr[0].equals("0")){
            return "0";
        }
        
        answer = sb.toString();
        
        
        return answer;
    }
}