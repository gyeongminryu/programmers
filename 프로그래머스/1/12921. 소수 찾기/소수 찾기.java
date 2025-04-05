class Solution {
    public int solution(int n) {
        
        boolean[] isComposit = new boolean[n+1]; //소수 = false
        int answer = 0;
        
        for(int i = 2; i < isComposit.length ; i++){
            if(!isComposit[i]){
                answer++;
                //i의 배수는 모두 true로 만들기
                for(int j = i*2; j<= n ; j+=i){ //i씩 증가
                    isComposit[j] =true;                    
                }
            }            
        }
        
        return answer;
    }
}