function solution(arr, intervals) {
    var answer = [];
    //1. intervals를 이중 for문
    
    for(var i = 0 ; i< intervals.length; i++){
               
          
        
            for(var m of arr.slice(intervals[i][0],intervals[i][1]+1)){
                answer.push(m);
            }
        
    }
    
    //2. arr에서 인덱스 
    //3. answer에 넣기 
    
    return answer;
}