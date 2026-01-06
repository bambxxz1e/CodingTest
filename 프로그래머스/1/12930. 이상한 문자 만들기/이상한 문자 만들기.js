function solution(s) {
    let arr = s.split(" ");
    
    for(let i = 0; i < arr.length; i++){
        let str = "";
        let word = arr[i].split("");
        
        for(let j = 0; j < word.length; j++)
            str += j % 2 ? word[j].toLowerCase() : word[j].toUpperCase();
        
        arr[i] = str;
    }
    
    return arr.join(" ");
}