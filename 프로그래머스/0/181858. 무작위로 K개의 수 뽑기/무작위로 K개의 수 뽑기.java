import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        
        
            for(int i = 0; i < arr.length; i++){
                set.add(arr[i]);
                if(set.size() == k){
                    break;
                }
            }
            List<Integer> list = new ArrayList<>(set);
        
            if(set.size() < k){
                for(int j =0; j< k - set.size();j++){
                    list.add(-1);
                }
            }
            
        return list;
    }
}