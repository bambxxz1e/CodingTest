function solution(t, p) {
    var answer = 0;
    let len = p.length;
    
    for(let i = 0; i <= t.length - len; i++){
        if(p >= t.substring(i, i + len)) answer++;
    }
    
    return answer;
}