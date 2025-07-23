function solution(num_list, n) {
    while(n > 0){
        num_list.push(num_list.shift());
        n--;
    }
    
    return num_list;
}