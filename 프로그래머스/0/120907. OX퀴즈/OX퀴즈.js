function solution(quiz) {
    var answer = [];
    
    for(let i of quiz){
        let arr = i.split(" ");
        let num = arr[1] === "+" ? Number(arr[0]) + Number(arr[2]) : Number(arr[0]) - Number(arr[2]);
        
        answer.push(num == arr[4] ? "O" : "X");
    }
    
    return answer;
}