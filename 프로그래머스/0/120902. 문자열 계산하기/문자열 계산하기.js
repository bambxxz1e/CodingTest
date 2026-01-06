function solution(my_string) {
    let arr = my_string.split(" ");
    let answer = [];
    
    while (arr.length > 0) {
        let i = arr.shift();
        
        if(isNaN(i)){
            let n1 = answer.pop();
            let n2 = Number(arr.shift());

            switch(i){
                case "+" : answer.push(n1 + n2); break;
                case "-" : answer.push(n1 - n2); break;
            }
        }
        else answer.push(Number(i));
    }
    
    return answer.pop();
}