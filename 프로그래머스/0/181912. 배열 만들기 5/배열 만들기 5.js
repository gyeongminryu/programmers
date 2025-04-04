function solution(intStrs, k, s, l) {
    var answer = [];
    
    //intStrs for 문 분리
    //splice(s,l);
    //이때 이게 k보다 크면 answer에 넣기 
    
    for(var i = 0 ; i< intStrs.length ; i++){
       
        if(intStrs[i].slice(s,s+l)>k){
            answer.push(parseInt(intStrs[i].slice(s,s+l)));
        }
    }
    
    return answer;
}