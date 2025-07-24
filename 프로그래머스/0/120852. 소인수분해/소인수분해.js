function solution(n) {
    var answer = [];
    
    let s = 2;
    
    while(n != 1){
        if(n % s == 0){
            if(!answer.includes(s))
                answer.push(s);
            n /= s;
        }
        else s++;
    }
    
    return answer;
}