class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for(int i = 0; i<= myString.length();i++){
            if(i+pat.length() <= myString.length()){
                if(pat.equals(myString.substring(i,i+pat.length()))){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}