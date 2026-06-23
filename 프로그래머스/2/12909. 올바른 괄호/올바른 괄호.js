function solution(s){
    let arr = s.split('');
    let stack = [];
    
    for(let i = 0; i < arr.length; i++){
        if(i === 0 && arr[i] === ')') return false;
        
        if(arr[i] === '(') stack.push('(');
        else stack.pop();
    }

    return stack.length ? false : true;
}