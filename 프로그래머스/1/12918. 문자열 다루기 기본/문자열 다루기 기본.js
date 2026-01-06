function solution(s) {
    var answer = true;
    
    for(let i of s)
        if(isNaN(i)){
            answer = false;
            break;
        }
    
    return s.length == 4 || s.length == 6 ? answer : false;
}