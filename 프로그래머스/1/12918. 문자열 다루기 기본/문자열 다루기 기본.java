class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        
        String[]arr= s.split("");
        int s_int =0;
        
        if(s.length()==4 ||s.length()==6) {
        	for (String string : arr) {
				for(int i = 0; i<10;i++) {
					String ss = ""+ i;
					if(string.equals(ss)) {
						s_int++;
					}
				}
			}
        	
        }
        
        if(s_int == s.length()){
        	answer= true;
        }
        
        return answer;
    }
}