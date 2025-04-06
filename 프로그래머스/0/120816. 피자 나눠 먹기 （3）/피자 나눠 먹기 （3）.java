class Solution {
    public int solution(int slice, int n) {
        //피자의 조각 수 slice, 피자를 먹는 사람 수
        //피자 갯수가 n으로 나눴을 때 1 이상이 나올때까지 *i해주기
        
        int answer = 1;
        while(slice*answer/n <1){
            answer++;
        }
        
        return answer;
    }
}