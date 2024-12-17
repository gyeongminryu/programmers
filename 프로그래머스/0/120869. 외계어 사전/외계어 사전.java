class Solution {
        public int solution(String[] spell, String[] dic) {
        int answer = 0;
        //dic 분리
        for (String dic_word : dic) {
        	//spell 분리
        	int include = 0;
        	for (int i = 0; i < spell.length; i++) {
				if(dic_word.contains(spell[i])) {
					
					include++;
				}
			}
//        	System.out.println(include);
//        	System.out.println(dic_word.length());
//        	System.out.println(spell.length);
        	
        	
        	//만약 dic배열안에 있는 spell의 단어 갯수가 spell의 실제 길이와 같다면?
        	if(include==spell.length) {
        		answer = 1;
        	}else {
        		if(answer!=1) { //이전에 한번 1인 적이 없었다면       			
        			answer = 2;
        		}
        	}
		}
			
		
        
        
       
        return answer;
    }
}