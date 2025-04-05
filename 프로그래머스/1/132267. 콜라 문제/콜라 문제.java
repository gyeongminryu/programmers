class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        //빈 병이 a개 이상일 때만 
        //빈병 = a 
        //콜라 = b
        //빈병 n
        while(n>=a){
             int exchange = (n / a) * b; // 교환으로 받은 콜라 수
             answer += exchange;
             n = (n % a) + exchange; // 남은 병 + 새로 받은 콜라 마신 후 빈 병
        }
        return answer;
    }
}