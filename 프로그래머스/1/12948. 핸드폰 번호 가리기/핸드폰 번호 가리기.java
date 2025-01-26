import java.util.Arrays;
import java.util.Iterator;

class Solution {
	   	public String solution(String phone_number) {

		String answer = "";

		String phone_number_front = phone_number.substring(0, phone_number.length() - 4);
		String phone_number_back = phone_number.substring(phone_number.length() - 4, phone_number.length());

		System.out.println(phone_number_front);
		System.out.println(phone_number_back);
		
		char[]arr = phone_number_front.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]='*';
		}
		
		//char배열을 String으로 만드는 법
		String str = new String(arr);
		System.out.println(str);
		
		answer = str.concat(phone_number_back);
		System.out.println(answer);
		
		return answer;
	}
}