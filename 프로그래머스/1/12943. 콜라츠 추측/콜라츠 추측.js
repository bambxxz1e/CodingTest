function solution(num) {
    var answer = 0;
    
    while(answer != 500 && num != 1){
        num = num % 2 ? num * 3 + 1 : num / 2;
        answer++;
    }
    
    return num == 1 ? answer : -1;
}