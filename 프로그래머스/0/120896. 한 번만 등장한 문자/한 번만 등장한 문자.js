function solution(s) {
    var answer = [];
    
    for(let i = 0; i < s.length; i++){
        if(s.split(s.charAt(i)).length == 2)
            answer.push(s.charAt(i));
    }
    
    return answer.sort().join("");
}