class Solution{
    public int solution(int[]arr){
        int answer = 0;
        String arr_check = "";
        
        for(int i =0 ; i <=9 ; i++){
            for(int j=0;j < arr.length; j++){
                arr_check+=arr[j];
            }
            if(!arr_check.contains(""+i)){
                answer+=i;
            }
        }
        
        return answer;
    }
    
}