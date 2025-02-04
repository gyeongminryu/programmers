class Solution{
    public String solution(String str){
        String answer = "";
        char[]arr= str.toCharArray();
        int length1 = 0;
        int length2 = 0;
        
        length1 = str.length()/2;
        length2 = str.length()/2-1;
        
        if(str.length() %2==0){
          answer = str.substring(length2, length1+1);
        }else{
            answer= str.substring(length1,length1+1);
        }
        return answer;
    }
}