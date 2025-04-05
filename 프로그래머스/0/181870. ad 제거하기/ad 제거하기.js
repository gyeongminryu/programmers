function solution(strArr) {
    var answer = [];
    
    //문자열도 includes
    
    for(var i = 0; i< strArr.length ;i++){
        if(!strArr[i].includes('ad')){
            answer.push(strArr[i]);   
        }
    }
    return answer;
}