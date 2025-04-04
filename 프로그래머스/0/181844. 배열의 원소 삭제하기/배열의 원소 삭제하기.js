function solution(arr, delete_list) {
    //arr에서 delete_list의 원소 모두 삭제
    //delete_list 돌면서 has로 가지고 있나 확인
    
    var answer = [];
    
    for(var i = 0; i < arr.length;i++){
            if(!delete_list.includes(arr[i])){
                answer.push(arr[i]);
            }
    }
    return answer;
}