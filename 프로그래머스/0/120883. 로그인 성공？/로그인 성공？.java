class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        
        //for로 i를 돌면서 0과 1이 모두 같아야 login
        
        //만약 0은 일치하는데 1이 일치 x wrong pw
        //만약 0이 일치하지 않으면 fail
        
        
        String id = "";
        String pw = "";
        
        for(int i = 0; i<db.length;i++){
            id = db[i][0];
            pw = db[i][1];
            if(id_pw[0].equals(id)){
                if(id_pw[1].equals(pw)){
                    answer = "login";
                    break;
                }else{
                    answer = "wrong pw";
                    break;
                }
            }else{
                answer= "fail";
            }
        }
        
        return answer;
    }
}