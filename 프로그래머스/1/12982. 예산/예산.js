function solution(d, budget) {
    var answer = 0;
    let sum = 0;
    d.sort((a, b) => a - b);
    
    for(let i of d){
        if(sum + i > budget) break;
        else{
            sum += i;
            answer++;
        }
    }
        
    
    return answer;
}