class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int num = 0;
        //left에서 right까지 하나씩 돌기
        for(int i = left; i <= right;i++){
            num=0;
                for(int j= 1; j<= i;j++){
                    if(i%j ==0){
                        num++;
                    }
                }
            
            
            if(num%2==0){
                answer+=i;
            }else{
                answer-=i;
            }
        }
        return answer;
    }
}