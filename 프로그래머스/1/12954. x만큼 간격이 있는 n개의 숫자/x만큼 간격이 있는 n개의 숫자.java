class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        Long a= (long) x;
        Long x_changed = (long) x;
        for(int i = 0 ; i< n; i++){
            answer[i] = x_changed;
            x_changed = x_changed+a;
        }
        return answer;
    }
}