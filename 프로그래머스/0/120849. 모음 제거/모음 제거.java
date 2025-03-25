class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[]arr = {"a","e","i","o","u"};
        
        for(int i = 0; i< arr.length; i++){
            my_string = my_string.replace(arr[i],"");
        }
        
        answer = my_string;
        return answer;
    }
}