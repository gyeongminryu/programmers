function solution(my_string) {
    var answer = '';
    //소문자로 변환
    //알파벳 순서대로 정렬
    
    var arr = my_string.toLowerCase().split('');
    
    
    
    arr.sort();
    
    answer = arr.join('');
    return answer;
}