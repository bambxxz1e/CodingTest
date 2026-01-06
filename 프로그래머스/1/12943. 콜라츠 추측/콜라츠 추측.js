function solution(num) {
    var answer = 0;
    
    if(num == 1) return answer;
    else{
        for(let i = 0; i < 500; i++){
            if(num == 1) break;
            num = num % 2 ? num * 3 + 1 : num / 2;
            answer++;
        }
    }
    
    if(answer > 0 && num != 1) answer = -1;
    return answer;
}