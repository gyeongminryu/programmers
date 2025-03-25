class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        //최대공약수
        int divide = gcd(n,m);
        
        //최소공배수 
        int multiple = (n*m)/ divide;
        
        answer[0] = divide;
        answer[1] = multiple;
        
        return answer;
    }


    
        public int gcd(int n,int m){
            int r = 0;
            while(m>0){
                r = n%m;
                n = m;
                m = r; 
            }
            return n; 
         }

    }
