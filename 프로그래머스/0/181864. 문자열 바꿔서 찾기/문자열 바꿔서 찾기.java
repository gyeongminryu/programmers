class Solution {    public int solution(String myString, String pat) {
        int answer = 0;
        int a = 0;
        char[]arr = myString.toCharArray();
        //1. charAt으로
        for(int i=0; i < myString.length();i++) {
            a = myString.charAt(i);	
           
            switch (a) {
			case 'A':
				arr[i] = 'B';
				break;
			case 'B':
				arr[i] = 'A';
				break;
			default:
				break;
			}
            
        }
        
        System.out.println(String.valueOf(arr));
        
      //2. contains로 확인
        if(String.valueOf(arr).contains(pat)) {
        	answer = 1;
        }
        
        return answer;
    }
}