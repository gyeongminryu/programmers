import java.util.*;
class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        String[]arr = Arrays.stream(str_list).filter((n)-> !n.contains(ex)).toArray(String[]::new);
        answer = String.join("",arr);
        return answer;
    }
}