class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long plus = 0;
        for(int i= 1; i<= count ; i++){
           plus += price*i;
        }
        
        if(plus>money){
            answer= ((long)plus- (long)money) ;
        }else{
            answer =0;
        }
        
        return answer;
    }
}