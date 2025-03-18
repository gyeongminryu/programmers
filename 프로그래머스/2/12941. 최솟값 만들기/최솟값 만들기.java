import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        
        Integer[] arr2 = Arrays.stream(B).boxed().toArray(Integer[]::new);
        
        Arrays.sort(arr2,Collections.reverseOrder());
        
        for(int i =0; i< A.length ; i++){
           answer += A[i] * arr2[i];
        }

        return answer;
    }
}