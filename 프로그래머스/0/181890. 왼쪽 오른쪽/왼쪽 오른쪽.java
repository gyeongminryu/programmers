import java.util.*;

class Solution {
    public List<String> solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        
        String n = "";
        int index = 0;
        for(int i = 0; i< str_list.length;i++){
            if(str_list[i].equals("l") || str_list[i].equals("r")){
                n = str_list[i];
                index= i;
                break;
            }
        }
        
        
        if(!n.equals("")){
            if(n.equals("l")){
            str_list = Arrays.copyOfRange(str_list,0, index);
            }else if(n.equals("r")){
                str_list = Arrays.copyOfRange(str_list,index+1,str_list.length);
            }

            for(int k = 0; k < str_list.length;k++){
                list.add(str_list[k]);
            }
        }
        
        return list ;
    }
}