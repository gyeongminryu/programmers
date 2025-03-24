import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        int answer = 0;
        
        
        for(int s : scoville){
            minheap.add(s);
        }
        
        int min1 = 0;
        int min2 = 0;
        while(minheap.peek()<K && minheap.size() > 1){
          min1 = minheap.poll();
          min2 = minheap.poll();
          minheap.add(min1 + (min2*2));
            
            answer++;
        }
        
        if(minheap.peek()<K){
            answer =-1;
        }
        return answer;
    }
}