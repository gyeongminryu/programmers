import java.util.Arrays;
class Solution {
    	public String[] solution(String[] quiz) {
        String[] answer = new String [quiz.length];
        
        for (int a = 0; a < quiz.length;a++) {
			//System.out.println(string);
			
			String[]s = quiz[a].split(" ");
			
			String num1 = "0";
			String num2 = "0";
			String pat = "";
			String result ="0";
			for(int i = 0; i<s.length;i++) {
				if(i==0) {
					num1 = s[i];
				}else if(i==1){
					pat = s[i];
				}else if(i==2) {
					num2 = s[i];
				}else if(i==4) {
					result = s[i];
				}
			
			}
			
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(result);
			System.out.println(pat);
			
			
			//비교
			int check = 0;
			
			switch (pat) {
			case "+":
				check = Integer.parseInt(num1)+ Integer.parseInt(num2); 
				
				break;
				
			case "-":
				check = Integer.parseInt(num1)- Integer.parseInt(num2); 
				
				break;	

			default:
				break;
			}
			
			System.out.println("check"+check);
			
			if(check == Integer.parseInt(result)) {
				answer[a] = "O";
			}else {
				answer[a] = "X";
			}
			
		}
        System.out.println(Arrays.toString(answer)); 
	return answer;
	
	}
}