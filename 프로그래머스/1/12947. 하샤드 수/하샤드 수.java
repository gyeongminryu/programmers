class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String a = String.valueOf(x);
        int plus = 0;
        
        for(int i=0; i< a.length(); i++){
           plus += a.charAt(i) -'0';
        }
        
        if(x%plus !=0){
            answer=false;
        }
        return answer;
    }
}