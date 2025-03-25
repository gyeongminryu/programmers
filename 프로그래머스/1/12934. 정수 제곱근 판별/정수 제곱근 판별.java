class Solution {
    public long solution(long n) {
        long answer = 0;
        double a = Math.sqrt(n);
        
        if((long)Math.pow(a,2) == n && (int)Math.sqrt(n) == a){
            answer= (long) Math.pow(a+1,2);
        }else{
         answer = -1;
        }
        
        return answer;
    }
}