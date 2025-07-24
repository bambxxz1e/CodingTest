function solution(n) {
    var answer = [];
    
    let s = 2;
    let pre = 0;
    
    while(n != 1){
        if(n % s == 0){
            if(s != pre){
                answer.push(s);
                pre = s;
            }
            n /= s;
        }
        else s++;
    }
    
    return answer;
}