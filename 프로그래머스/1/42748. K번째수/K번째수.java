import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
	 public int[] solution(int[] array, int[][] commands) {
	        //System.out.println(commands.length);
		 
		 int[] answer = new int[commands.length];
	     int first = 0;
	     int end = 0;
	     int position = 0;
	     
		 
		 for(int i=0;i<commands.length;i++) {
			System.out.println(Arrays.toString(commands[i]));
			
				
					first = commands[i][0];
					
					end = commands[i][1];
					
					position = commands[i][2];
					
			System.out.println(first+"/"+end+"/"+position);
			
			ArrayList<Integer> ar = new ArrayList<Integer>();
			for(int a=first-1; a<=end-1;a++) {
					ar.add(array[a]);
					//answer[i] = array[a];
			}
			System.out.println("ar"+ar);
			
			//ArrayList 정렬
			Collections.sort(ar);
			//System.out.println(ar.get(position-1));
			answer[i] = ar.get(position-1);
		 }
		 
		 //System.out.println(Arrays.toString(answer));
	     return answer; //answer
	    }
}
