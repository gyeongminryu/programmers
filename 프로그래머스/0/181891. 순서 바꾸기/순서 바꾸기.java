class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int a = 0;
        
        //1부터 
        for(int i =n ; i< num_list.length ;i++){
            answer[a] = num_list[i];
            a++;
        }
        
        for(int j=0; j<n; j++){
            answer[a] = num_list[j];
            a++;
        }
        
        
        return answer;
    }
}