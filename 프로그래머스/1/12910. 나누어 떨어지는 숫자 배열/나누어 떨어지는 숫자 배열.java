import java.util.*;

class Solution {
    public List <Integer> solution(int[] arr, int divisor) {
        
        List <Integer> list = new ArrayList<>();
        
        for (int i= 0; i< arr.length ; i++){
         if(arr[i]%divisor ==0){
             list.add(arr[i]);
             //answer[i] = arr[i];
         }   
        }
        Collections.sort(list); //list에 다시 넣지 않아도 됨 
        if(list.size() == 0){
            list.add(-1);
        }
        
        
    return list;
    }
}