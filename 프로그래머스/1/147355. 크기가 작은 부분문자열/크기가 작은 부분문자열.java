class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String a = "";
        
        //p의 길이만큼 t 자르기 -> 이때 p보다 작거나 같은 숫자 카운트
                
                for(int i = 0; i<=t.length()-p.length();i++){
                    a = t.substring(i,i+p.length());
                    if(Long.parseLong(a)<= Long.parseLong(p)){
                        answer++;                    
                    }
                }
        return answer;
    }
}