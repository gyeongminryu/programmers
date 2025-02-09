class Solution {
    public int solution(String s) {
        int answer = 0;
        int split = 0;
        int same = 0; 
        int differ = 0; 
        int a= 0;
        String[]arr = s.split("");
        for(int i = 0; i< arr.length; i++){
            if(arr[i].equals(arr[a])){ 
                same ++;
            }else{
                differ++;
            }
             
            if(same == differ){
             same = 0;
             differ =0;
             a = i+1;
                split++;
            }else if(same!=differ && i == arr.length-1){
                split++;
            }
        }
        answer= split;
        return answer;
    }
}