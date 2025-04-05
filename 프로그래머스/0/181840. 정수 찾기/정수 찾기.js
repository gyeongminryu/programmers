function solution(num_list, n) {
    var answer = 0;
    
    //includes
    if(num_list.includes(n)){
        answer= 1;
    }else{
        answer = 0;
    }
    
    return answer;
}