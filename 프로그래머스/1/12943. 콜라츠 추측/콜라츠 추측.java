class Solution {
    public long solution(int n) {
		long answer = 0;
		long number= (long)n;
		   
		while(number!=1) {
			if(answer<500) {
				if(number%2==0) {
					number/=2;
					answer++;
				}else {
					number*=3;
					number+=1;
					answer++;
				}
				
			}else {
				answer= -1;
				break;
			}

		}
		   return answer;
	    }
}