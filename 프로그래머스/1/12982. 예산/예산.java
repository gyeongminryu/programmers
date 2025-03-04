import java.util.Arrays;
class Solution {
      public int solution(int[]d, int budget) {
	  
		int answer = 0;
		int plus =0;
		int i =0;
		   
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
		
			for(i=0; i<d.length ;i++) {
					
					if(d[i]<=budget) {
						plus+=d[i];
						if(i+1<d.length) {
							if(plus+d[i+1]>budget) {
								break;
							}
						}else {
							break;
						}
					}else {
						i-=1;
						break;
					}
			}
			
			answer =i+1;
		   return answer;
	   }
}