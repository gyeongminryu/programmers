function solution(rny_string) {
    var answer = '';
    
    while(rny_string.includes('m')){
        rny_string = rny_string.replace('m','rn');
    }
    answer = rny_string;
    
    return answer;
}