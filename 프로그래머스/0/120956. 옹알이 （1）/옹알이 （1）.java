class Solution {
        public int solution(String[] babbling) {
	        int answer = 0;
	        
	        //길이 비교용
	        int length = 0;
	        
	        
	        String[]arr = {"aya", "ye", "woo", "ma"};
	        
	        for (String string : babbling) {
	        	length =0;
				/*
				 * System.out.println(string); System.out.println(string.length());
				 */
	        	for (String string2 : arr) {					
					/*
					 * System.out.println(string2); System.out.println(string2.length());
					 */
	        		
	        		if(string.contains(string2)) {	        			
	        			length+= string2.length();
	        		}
	        		
				}
	        	
	        	
	        	if(string.length()== length) {
	        		answer++;
	        	}
	        	
			}
	         
	        return answer;
	    }
}
