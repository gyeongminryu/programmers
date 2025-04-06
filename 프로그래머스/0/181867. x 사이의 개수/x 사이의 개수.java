import java.util.*;
class Solution {
    public Integer[] solution(String myString) {
        
        String[]arr= myString.split("x",-1);
        
        return Arrays.stream(arr).map((n)-> n.length()).toArray(Integer[]::new);
    }
}