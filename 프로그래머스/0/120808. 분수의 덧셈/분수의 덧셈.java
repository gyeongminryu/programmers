import java.util.Arrays;

class Solution {
  	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int num= numer1 *denom2 + numer2 *denom1;
        int denom = denom1 * denom2;
        
        
        System.out.println(num);
        System.out.println(denom);
        System.out.println(num%denom);
        
        int result = gsd(num,denom);
        
        answer[0]= num/result;
        answer[1] = denom/result;
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }

	int gsd(int num, int denom) {
		
		while(num%denom>0) {
        	int temp = num % denom;
        	num= denom;
        	denom = temp;
        }
        
        System.out.println(denom);
        return denom;
	}

}