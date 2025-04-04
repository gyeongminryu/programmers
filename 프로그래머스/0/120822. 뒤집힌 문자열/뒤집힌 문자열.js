function solution(my_string) {
    var answer = '';
    var arr = [];
    arr = my_string.split("");
    
    arr.reverse((b,a)=> b-a);
    
    answer = arr.join('');
    
    return answer;
    
}