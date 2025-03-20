import java.util.*;

public class Solution {
public List<Integer> solution(int[] progresses, int[] speeds) {
List<Integer> answer = new ArrayList<>();
Queue<Integer> queue = new LinkedList<Integer>();
    
    int date = 0;
    for(int i =0; i< progresses.length;i++){
        date = (100-progresses[i])/ speeds[i];
        if((100-progresses[i]) % speeds[i]>0){
            date +=1;
        }
        queue.offer(date);
    }
    
    
    
    
    while(!queue.isEmpty()){
        int num = 1;
        Integer prev = queue.poll();
        
        // LinkedList로 형변환 후 Deque 메서드 사용
        Deque<Integer> deque = (Deque<Integer>) queue;
        
        
        
        while(queue.peek()!= null && queue.peek() <= prev){
        	queue.poll();
        	num++;
        }
        answer.add(num);
    }

    return answer;
}
    }