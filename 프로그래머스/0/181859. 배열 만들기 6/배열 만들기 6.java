import java.util.*;
class Solution {
    public Stack<Integer> solution(int[] arr) {
        //후입 선출 Queue
        
        Stack <Integer> answer = new Stack<>();
        int i = 0; 

        while(i <arr.length){
            if(answer.size() == 0){
            answer.push(arr[i]);
            i++;
        }else{
            if(answer.peek() == arr[i]){
                answer.pop();
                i++;
            }else{
                answer.push(arr[i]);
                i++;
            }
        }
        }
        
        if(answer.size() ==0){
            answer.push(-1);
        }
        
        return answer;
    }
}